package br.pauloDev.user_cadaster.model.user;

import br.pauloDev.user_cadaster.model.task.Task;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_user_cadaster")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long task_id;

    private List<Task> taskList;

    private String user_name;

    private int age;

    private String phoneNumber;

    private String email;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task entity_task;

}
