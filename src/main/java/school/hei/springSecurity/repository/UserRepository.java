package school.hei.springSecurity.repository;

import school.hei.springSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String pseudo);
}
