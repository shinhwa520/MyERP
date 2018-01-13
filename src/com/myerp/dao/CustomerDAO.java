package com.myerp.dao;

import org.springframework.stereotype.Repository;

import com.myerp.model.Customer;



@Repository("customerDAO")
public class CustomerDAO extends BaseDAO<Customer> {

	public CustomerDAO() {
		super(Customer.class);
		// TODO Auto-generated constructor stub
	}

}
