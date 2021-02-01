package com.viniciusfrois.sbmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusfrois.sbmongo.domain.User;
import com.viniciusfrois.sbmongo.dto.UserDTO;
import com.viniciusfrois.sbmongo.repository.UserRepository;
import com.viniciusfrois.sbmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(String id) {
		Optional<User> obj = repository.findById(id);
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found"));
	}
	
	public User insert(User obj) {
		return repository.insert(obj);
	}
	
	public void deleteById(String id) {
		repository.deleteById(id);
	}

	/* PUT - fazer o metodo updateData
	public User update(User obj) {
		User newObj = repository.findById(obj.getId());
		updateData(newObj, obj);
		return repository.save(newObj);
	}
	*/
	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(),objDto.getName(), objDto.getEmail());
	}
	
}
