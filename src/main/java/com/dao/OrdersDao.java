package com.dao;

import java.util.List;

import com.entity.Orders;

public interface OrdersDao {
	
	public List<Orders> findAll();

}
