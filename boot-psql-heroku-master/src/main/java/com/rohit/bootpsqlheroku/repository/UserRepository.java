package com.rohit.bootpsqlheroku.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rohit.bootpsqlheroku.model.ApplicationUser;

@Repository
public interface UserRepository extends CrudRepository<ApplicationUser, Long> {

	List<ApplicationUser> findAllByOrderByFullName();
}
