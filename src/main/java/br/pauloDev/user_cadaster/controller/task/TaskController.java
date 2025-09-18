package br.pauloDev.user_cadaster.controller.task;

import br.pauloDev.user_cadaster.model.task.Task;
import br.pauloDev.user_cadaster.service.task.TaskService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService service;
    @GetMapping
    public List<Task> getAll () {
        return service.findAll();
    }
}
