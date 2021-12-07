package com.mthree.cardealership.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.cardealership.dao.SaleDAO;
import com.mthree.cardealership.dao.UserDao;
import com.mthree.cardealership.dao.VehicleDao;
import com.mthree.cardealership.entity.Vehicle;
import java.util.List;

@Service
public class CarDealershipServiceLayer {
	
	@Autowired
	private SaleDAO saleDao;
	@Autowired
	private VehicleDao vehicleDao;
	@Autowired
	private UserDao userDao;
        
        
    public List<Vehicle> getNewCars(){
        return vehicleDao.getNewCars();
    }
    
     public List<Vehicle> getUsedCars(){
        return vehicleDao.getUsedCars();
    }
	
	
}
