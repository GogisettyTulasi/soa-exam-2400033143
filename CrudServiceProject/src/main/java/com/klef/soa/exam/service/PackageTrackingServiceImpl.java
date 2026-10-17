package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.PackageTrackingEntity;
import com.klef.soa.exam.repository.PackageTrackingRepository;

@Service 
public class PackageTrackingServiceImpl implements PackageTrackingService
{

	@Autowired 
	private PackageTrackingRepository repo;  
	
	@Override
	public PackageTrackingEntity addPackage(PackageTrackingEntity packagee) {
		return repo.save(packagee);
	}

	@Override
	public List<PackageTrackingEntity> displayall() {
		return repo.findAll();
	}

	@Override
	public String delete(Long id) {
		if(repo.existsById(id)) { 
			repo.deleteById(id);
			return "Package deleted Successfully"; 
		}
		else
			return "Package not found";
	}

}
