package com.sprinboot.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sprinboot.app.model.CloudVendor;

public interface CloudVendorRespositor extends JpaRepository<CloudVendor, String > {

	@Query(nativeQuery = true, value = "select * from cloud_venodr.cloud_vendor_info where vendor_name=?1")
	Optional<CloudVendor> findByName( String cloudVendorId);
	
	@Query(nativeQuery = true, value = "select * from cloud_venodr.cloud_vendor_info where vendor_name=?1")
	List<CloudVendor> getByVendorName(String vendorName);
	
	

}
