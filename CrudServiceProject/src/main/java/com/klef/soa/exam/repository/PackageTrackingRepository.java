package com.klef.soa.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.soa.exam.entity.PackageTrackingEntity;

public interface PackageTrackingRepository extends JpaRepository<PackageTrackingEntity, Long>
{

}
