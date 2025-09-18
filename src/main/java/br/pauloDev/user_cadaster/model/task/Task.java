package br.pauloDev.user_cadaster.model.task;

import br.pauloDev.user_cadaster.model.user.User;
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
@Table(name = "db_task_list")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;

    private String taskName;

    private String description;

    @OneToMany(mappedBy = "task_executor_id")
    private List <User> taskExecutorId;

}
