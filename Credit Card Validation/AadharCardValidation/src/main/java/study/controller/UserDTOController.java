package study.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import study.model.UserDTO;

@RestController
public class UserDTOController {
	
	@PostMapping("/create")
	public ResponseEntity<?> createUser(@Valid @RequestBody UserDTO userDTO, BindingResult result){
		
		if(result.hasErrors()) {
			Map<String, String> allErrors = new HashMap<>();
			for(FieldError fieldError :result.getFieldErrors()) {
				allErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return new ResponseEntity<>(allErrors, HttpStatus.BAD_REQUEST);			
		}
		//save the user if repository is used
		//respository.save(userDTO);
		
		return new ResponseEntity<>(userDTO, HttpStatus.CREATED);
		
	}
	
}
