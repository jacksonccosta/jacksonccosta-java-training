package course.java.training.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import course.java.training.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
