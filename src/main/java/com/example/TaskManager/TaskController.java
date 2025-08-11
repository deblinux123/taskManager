package com.example.TaskManager;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String listTasks(HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) return "redirect:/login";

        model.addAttribute("tasks", taskService.getTasksByUser(currentUser));
        model.addAttribute("task", new Task());
        return "tasks";
    }

    @PostMapping
    public String saveTask(@ModelAttribute Task task, HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) return "redirect:/login";

        task.setUser(currentUser);
        taskService.saveTask(task);
        return "redirect:/tasks";
    }

    @GetMapping("/edit/{id}")
    public String editTask(@PathVariable Long id, HttpSession session, Model model) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) return "redirect:/login";

        Task task = taskService.getTaskById(id);
        if (task == null || !task.getUser().getId().equals(currentUser.getId())) {
            return "redirect:/tasks";
        }

        model.addAttribute("task", task);
        model.addAttribute("tasks", taskService.getTasksByUser(currentUser));
        return "tasks";
    }

    @GetMapping("/delete/{id}")
    public String deleteTask(@PathVariable Long id, HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");
        if (currentUser == null) return "redirect:/login";

        Task task = taskService.getTaskById(id);
        if (task != null && task.getUser().getId().equals(currentUser.getId())) {
            taskService.deleteTask(id);
        }
        return "redirect:/tasks";
    }
}
