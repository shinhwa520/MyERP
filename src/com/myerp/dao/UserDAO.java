package com.myerp.dao;

import java.util.List;

import com.myerp.model.User;

public interface UserDAO {
	void add(User user);
	List<User> listUsers();
}
