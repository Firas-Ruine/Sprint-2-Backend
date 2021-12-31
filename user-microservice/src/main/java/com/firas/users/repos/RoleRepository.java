package com.firas.users.repos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.firas.users.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	@Autowired
	Role findByRole(String role);
}
