package br.pauloDev.user_cadaster.service.task;

import br.pauloDev.user_cadaster.model.task.Task;
import br.pauloDev.user_cadaster.repository.task.TaskRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TaskService {

    final TaskRepository taskRepository;

    public Optional <Task> findById(Long id){
        return taskRepository.findById(id);
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }
}