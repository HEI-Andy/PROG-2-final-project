package school.hei.springSecurity.repository;

import school.hei.springSecurity.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.springSecurity.model.User;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByUsername(String Role);
}