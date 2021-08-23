package course.java.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.java.training.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
