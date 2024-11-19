package com.suresh.jobportal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suresh.jobportal.entity.JobSeekerProfile;

public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
}