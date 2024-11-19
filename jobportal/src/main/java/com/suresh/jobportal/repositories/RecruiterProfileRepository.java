package com.suresh.jobportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.jobportal.entity.RecruiterProfile;

public interface RecruiterProfileRepository extends JpaRepository<RecruiterProfile, Integer> {
}