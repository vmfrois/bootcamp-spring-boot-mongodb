package com.viniciusfrois.sbmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viniciusfrois.sbmongo.domain.User;
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
		 return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto nao encontrado"));
	}

}
