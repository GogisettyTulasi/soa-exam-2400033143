package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.PackageTrackingEntity;

public interface PackageTrackingService 
{
	
		PackageTrackingEntity addPackage(PackageTrackingEntity packagee);
		
		List<PackageTrackingEntity> displayall();
		
		String delete(Long id);

}
