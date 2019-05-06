package co.uk.mak.tripmate.Controllers;

import java.util.UUID;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import co.uk.mak.tripmate.Models.User_Profile;
import co.uk.mak.tripmate.Service.User_ProfileService;

@Controller
public class ProfileController {

	private final User_ProfileService user_ProfileService;
	
	public ProfileController(User_ProfileService user_ProfileService) {
		super();
		this.user_ProfileService = user_ProfileService;
	}

	@GetMapping(path= "/json", consumes = "application/json", produces = "application/json")
	public ResponseEntity<String> json() {
		return ResponseEntity.ok("{\"test\":\"data\"}");
	}
	
	@GetMapping(path= "/test", produces = "application/json")
	public ResponseEntity<String> test() {
		return ResponseEntity.ok("test");
	}
	
	
	@GetMapping(path= "/user/{id}", consumes = "application/json", produces = "application/json")
	public ResponseEntity<User_Profile> getUserById(@PathVariable UUID id){
		return ResponseEntity.ok(
				user_ProfileService.findById(id)
				.orElse(
						new User_Profile()));
	}

}
