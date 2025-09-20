package br.pauloDev.user_cadaster.controller.task;

import br.pauloDev.user_cadaster.error.CustomErrorType;
import br.pauloDev.user_cadaster.model.task.Task;
import br.pauloDev.user_cadaster.service.task.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("task")
public class TaskController {
    @Autowired
    private TaskService service;

    @GetMapping
    public List<Task> getAll() {
        return service.findAll();
    }

    @GetMapping(path = "search-task/{id}")
    public ResponseEntity<?> searchTaskById(@PathVariable ("id") Long id) {
        Optional<Task> task = service.findById(id);
        if (task.isEmpty())
            return (new ResponseEntity<>(new CustomErrorType("Id not exist!"),HttpStatus.NOT_FOUND));
        return (new ResponseEntity<>(task.get(),HttpStatus.OK));
    }


}
