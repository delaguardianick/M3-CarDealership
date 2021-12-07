package com.mthree.cardealership.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.cardealership.dao.SaleDAO;
import com.mthree.cardealership.dao.UserDao;
import com.mthree.cardealership.dao.VehicleDao;

@Service
public class CarDealershipServiceLayer {
	
	@Autowired
	private SaleDAO saleDao;
	@Autowired
	private VehicleDao vehicleDao;
	@Autowired
	private UserDao userDao;
}
