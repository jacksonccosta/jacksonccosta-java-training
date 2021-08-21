package course.java.training.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import course.java.training.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Jackson Costa","jacksonccosta@yahoo.com","(11)97339-5348","1234");
		return ResponseEntity.ok().body(u);
	}
}
