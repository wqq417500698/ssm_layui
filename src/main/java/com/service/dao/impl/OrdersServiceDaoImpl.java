package com.service.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.OrdersDao;
import com.entity.Orders;
import com.service.dao.OrdersServiceDao;
@Service
public class OrdersServiceDaoImpl implements OrdersServiceDao{
	@Autowired
    private OrdersDao dao;
	@Override
	public List<Orders> findAll() {
		 
		return dao.findAll();
	}

}
