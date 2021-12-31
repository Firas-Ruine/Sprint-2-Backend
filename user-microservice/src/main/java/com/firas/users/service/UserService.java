package com.firas.users.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.firas.users.entities.Role;
import com.firas.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	@Autowired
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
}
