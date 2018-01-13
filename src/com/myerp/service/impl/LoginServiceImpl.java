package com.myerp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myerp.dao.UserDAO;
import com.myerp.model.User;
import com.myerp.service.LoginService;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
	@Autowired
	private UserDAO userDao;
	
	@Transactional(readOnly = true)
	@Override
	public List<User> listUsers() {
	   return userDao.listUsers();
	}
}
