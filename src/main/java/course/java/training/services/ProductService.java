package course.java.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.java.training.entities.Product;
import course.java.training.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository userRepository;
	
	public List<Product> findAll(){
		return userRepository.findAll();
	}
		
	public Product findById(Long Id){
		Optional<Product> user = userRepository.findById(Id);
		return user.get();
	}
}
