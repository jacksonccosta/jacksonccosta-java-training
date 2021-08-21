package course.java.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.java.training.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
