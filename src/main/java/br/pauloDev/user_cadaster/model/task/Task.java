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
    @Column(name = "task_id")
    private Long id;

    @Column(name = "task_name")
    private String taskName;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "task_executor_id")
    private List <User> taskExecutorId;

}
