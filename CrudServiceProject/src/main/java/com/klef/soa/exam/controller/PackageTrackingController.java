package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.exam.entity.PackageTrackingEntity;
import com.klef.soa.exam.service.PackageTrackingServiceImpl;

@RequestMapping("/package")
@RestController
public class PackageTrackingController 
{
	@Autowired
	private PackageTrackingServiceImpl service;
	
	@GetMapping("/")
	public String Home() {
		return "Package Tracking Service is running...";
	}
	
	@PostMapping("/Add") 
	public PackageTrackingEntity addPackage(@RequestBody PackageTrackingEntity packagee) {
		return service.addPackage(packagee);
	}
	
	@GetMapping("/DisplayAll")
	public List<PackageTrackingEntity> getAllPackages() 
	{
		return service.displayall();
	}
	 
	@DeleteMapping("/Delete/{id}")
	public String deletePackage(@PathVariable long id) {
		return service.delete(id);
	}
	
}
