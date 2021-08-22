package course.java.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.java.training.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
