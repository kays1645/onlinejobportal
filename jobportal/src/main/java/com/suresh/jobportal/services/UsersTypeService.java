package com.suresh.jobportal.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.suresh.jobportal.entity.UsersType;
import com.suresh.jobportal.repositories.UsersTypeRepository;

@Service
public class UsersTypeService {
	private final UsersTypeRepository usersTypeRepository;

	public UsersTypeService(UsersTypeRepository usersTypeRepository) {
		this.usersTypeRepository = usersTypeRepository;
	}
	public List<UsersType> getAll(){
		return usersTypeRepository.findAll();
	}
	
}
