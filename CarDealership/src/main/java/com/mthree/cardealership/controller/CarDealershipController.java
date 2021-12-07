package com.mthree.cardealership.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CarDealershipController {
	
	// TODO: Autowire service layer
	
	// TODO: change Objects to entites, double check all endpoints
	@GetMapping("/inventory/new")
	public List<Object> getNewCars() {
		return null;
	}
	
	@GetMapping("/inventory/used")
	public List<Object> getUsedCars() {
		return null;
	}
	
	@GetMapping("/inventory/details/{id}")
	public Object getCarDetails(@PathVariable("id") int id) {
		return null;
	}
	
	@GetMapping("/specials")
	public List<Object> getSpecials() {
		return null;
	}
	
	@GetMapping("sales/index") // Sales Role ONLY
	public List<Object> getSalesIndex() {
		return null;
	}
	
	@PostMapping("/sales/purchase/{id}")
	public Object makePurchase(@PathVariable("id") int id) {
		return null;
	}
	
	@GetMapping("/admin/vehicles")
	public List<Object> getVehicleInventory() {
		return null;
	}
	
	@PostMapping("/admin/addvehicle")
	public Object addVehicle(Object vehicle) {
		return null;
	}
	
	@PutMapping("/admin/editvehicle")
	public Object editVehichle(@RequestBody Object vehicle) {
		return null;
	}
	
	@GetMapping("/admin/users")
	public List<Object> getUsers() {
		return null;
	}
	
	@PostMapping("/admin/adduser")
	public Object addNewUser() {
		return null;
	}
	
	@PutMapping("/admin/edituser")
	public Object editUser(@RequestBody Object user) {
		return null;
	}
	
	@PostMapping("/admin/makes")
	public Object addMake(Object make) {
		return null;
	}
	
	@PostMapping("/admin/models")
	public Object addModel(Object model) {
		return null;
	}
	
	@GetMapping("/reports/sales")
	public List<String> getSales() {
		return null;
	}
	
	@GetMapping("/reports/inventory")
	public List<String> getInventory() {
		return null;
	}
	
}
