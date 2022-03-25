package com.mobile.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

//this is the controller class which interact with the postman by urls

@RestController
@RequestMapping("/mobile") //http:://localhost:8086/mobile
public class MobileController {
	
	@Autowired
	MobileService service;
	
	@PostMapping("/addMobile")//http://localhost:8086/mobile/addMobile
	public Mobile addMobile (@RequestBody Mobile m) {
		return service.addMobile(m);
	}
	
	@PutMapping("/updateMobile")//http://localhost:8086/mobile/updateMobile
	public Mobile updateMobile(@RequestBody Mobile m1) {
		return service.updateMobile(m1);
	}
	
	@GetMapping("/getMobile/{id}")//http://localhost:8086/mobile/getMobile/id
    public Optional<Mobile> getMobile(@PathVariable("id") int id) {
		return service.getMobile(id);
	}
	@GetMapping("getAllMobile")//http://localhost:8086/mobile/getAllMobile
	public Iterable<Mobile> getAllMobile()
	{
		return service.getAllMobile();
	}
	@DeleteMapping("/deleteMobile/{id}")//http://localhost:8086/mobile/deleteMobile/id
	public void deleteMobile(@PathVariable("id") int id)
	{
		service.deleteMobile(id);
	}
}
