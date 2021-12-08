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
		return svc.getFeaturedVehicles();
	}
	
	@GetMapping("/inventory/new")
	public List<Vehicle> getNewCars() {
		return null;
	}
	
	@GetMapping("/inventory/used")
	public List<Vehicle> getUsedCars() {
		return null;
	}
	
	@GetMapping("/inventory/details/{id}")
	public Vehicle getCarDetails(@PathVariable("id") String vin) {
		return null;
	}
	
	@GetMapping("/sales/index") // Sales Role ONLY
	public List<Sale> getSalesIndex() {
		return null;
	}
	
	@PostMapping("/sales/purchase/{vehicleId}")
	public Sale makePurchase(@PathVariable("vehicleId") String vehicleId) {
		return svc.completeSale(vehicleId);
	}
	
}
