package com.mthree.cardealership.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.cardealership.entity.Sale;
import com.mthree.cardealership.entity.Vehicle;
import com.mthree.cardealership.service.CarDealershipServiceLayer;

@RestController
@RequestMapping("/api")
public class CarDealershipController {
	
	@Autowired
	private CarDealershipServiceLayer svc;
	
	@GetMapping("/home/index")
	public List<Vehicle> getFeatured() {
		return null;
	}
	
	@GetMapping("/inventory/new")
	public List<Vehicle> getNewCars() {
            
            List<Vehicle> newCars = svc.getNewCars();
            return newCars;
	}
	
	@GetMapping("/inventory/used")
	public List<Vehicle> getUsedCars() {
            
            List<Vehicle> usedCars = svc.getUsedCars();
            return usedCars;
	}
	
	@GetMapping("/inventory/details/{id}")
	public Vehicle getCarDetails(@PathVariable("id") String vin) {
		return null;
	}
	
	@GetMapping("/sales/index") // Sales Role ONLY
	public List<Sale> getSalesIndex() {
		return null;
	}
	
	@PostMapping("/sales/purchase/{id}")
	public Sale makePurchase(@PathVariable("id") int vehicleId) {
		return null;
	}
	
}
