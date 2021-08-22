package course.java.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.java.training.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
