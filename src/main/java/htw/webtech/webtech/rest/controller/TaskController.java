package htw.webtech.webtech.rest.controller;

import htw.webtech.webtech.Studyplanner.service.TaskService;
import htw.webtech.webtech.rest.model.TaskDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) { this.taskService = taskService;}

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskDTO>> getTasks(){

        return ResponseEntity.ok(taskService.getAllTasks());
    }
}
