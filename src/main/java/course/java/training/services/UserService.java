package course.java.training.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import course.java.training.entities.User;
import course.java.training.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}
		
	public User findById(Long Id){
		Optional<User> user = userRepository.findById(Id);
		return user.get();
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = userRepository.getOne(id);
		updateData(entity, obj);
		return userRepository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
