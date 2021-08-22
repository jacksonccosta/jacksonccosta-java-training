package course.java.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.java.training.entities.Category;
import course.java.training.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository userRepository;
	
	public List<Category> findAll(){
		return userRepository.findAll();
	}
		
	public Category findById(Long Id){
		Optional<Category> user = userRepository.findById(Id);
		return user.get();
	}
}
