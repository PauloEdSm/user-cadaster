package br.pauloDev.user_cadaster.repository.user;

import br.pauloDev.user_cadaster.model.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByNameIgnoreCase(String nameUserRepositor);

}
