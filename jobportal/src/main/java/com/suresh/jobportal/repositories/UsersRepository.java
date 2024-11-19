package com.suresh.jobportal.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.jobportal.entity.Users;

public interface UsersRepository extends JpaRepository<Users,Integer> {
	Optional <Users> findByEmail(String email);

}
