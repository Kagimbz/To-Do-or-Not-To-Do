package com.kagimbz.task_manager.service;

import com.kagimbz.task_manager.model.Task;
import com.kagimbz.task_manager.repository.TaskRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TaskService {
    private final TaskRepo taskRepo;

    public void addTask(String title, String desc, LocalDate dueDate) {
        Task task = new Task();
        task.setTitle(title);
        task.setDescription(desc);
        task.setDueDate(dueDate);

        taskRepo.save(task);
    }

    public List<Task> fetchAllTasks() {
        return taskRepo.findAll();
    }

    public void markTaskAsComplete(Long id) {
        taskRepo.findById(id).ifPresent(task -> {
            task.setCompleted(true);
            taskRepo.save(task);
        });
    }

    public void deleteTask(Long id) {
        taskRepo.deleteById(id);
    }
}
