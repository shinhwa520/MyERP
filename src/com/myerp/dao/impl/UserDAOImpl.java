package com.myerp.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myerp.dao.UserDAO;
import com.myerp.model.User;


@Repository
@Transactional
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void add(User user) {
	   sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public List<User> listUsers() {
	   @SuppressWarnings("unchecked")
	   TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
	   return query.getResultList();
	}
}
