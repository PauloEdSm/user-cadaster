package br.pauloDev.user_cadaster.repository.task;

import br.pauloDev.user_cadaster.model.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List <Task> findByTaskNameIgnoreCase (String taskName);
}
