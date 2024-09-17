package com.kagimbz.task_manager.controller;

import com.kagimbz.task_manager.model.Task;
import com.kagimbz.task_manager.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(path = "/tasks")
@RequiredArgsConstructor
@Slf4j
public class TaskController {
    private final TaskService taskService;

    @GetMapping(path = "/")
    public String homePage(Model model) {
        List<Task> tasks = taskService.fetchAllTasks();
        model.addAttribute("tasks", tasks);
        return "index";
    }

    @PostMapping(path = "/add")
    public String addTask(@RequestParam String title, @RequestParam String desc, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dueDate) {
        taskService.addTask(title, desc, dueDate);
        return "redirect:/tasks/";
    }

    @PostMapping(path = "/{id}/complete")
    public String markTaskAsComplete(@PathVariable Long id) {
        taskService.markTaskAsComplete(id);
        return "redirect:/tasks/";
    }

    @PostMapping(path = "/{id}/delete")
    public String deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return "redirect:/tasks/";
    }
}
