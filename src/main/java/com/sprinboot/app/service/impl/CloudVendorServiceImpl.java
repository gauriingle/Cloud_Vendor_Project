package com.sprinboot.app.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sprinboot.app.model.CloudVendor;
import com.sprinboot.app.repository.CloudVendorRespositor;
import com.sprinboot.app.service.CloudVendorService;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

	CloudVendorRespositor cloudVendorRepository;
	
	public CloudVendorServiceImpl(CloudVendorRespositor cloudVendorRepository) {
	
		this.cloudVendorRepository = cloudVendorRepository;
	}

	@Override
	public CloudVendor createCloudVendor(CloudVendor cloudVendor) {
		//More Business Logic
		CloudVendor cloudVendorobject=cloudVendorRepository.save(cloudVendor);
		return cloudVendorobject;
	}

	@Override
	public String updateCloudVendor(CloudVendor cloudVendor) {
		//More Business Logic
		cloudVendorRepository.save(cloudVendor);
		return "Success";
	}

	@Override
	public String deleteCloudVendor(String cloudVendorId) {
		//More Business Logic
		cloudVendorRepository.deleteById(cloudVendorId);
		return "Success";
	}

	@Override
	public CloudVendor getCloudVendor(String cloudVendorId) {
		
		//More Business Logic this is only using object 
	//	CloudVendor cloudVendor = cloudVendorRepository.findByName(cloudVendorId);
		
		//this one when we are using optional
		Optional<CloudVendor> cloudVendor = cloudVendorRepository.findByName(cloudVendorId);
		if(cloudVendor.isPresent()) {
			return cloudVendor.get();
		}
		
		return null;
	}

	@Override
	public List<CloudVendor> getAllCloudVendor() {
		
		return cloudVendorRepository.findAll();
	}

	@Override
	public List<CloudVendor> createAllCloudVendor(List<CloudVendor> cloudVendor) {
		
		List<CloudVendor> cloudVendorobject=cloudVendorRepository.saveAll(cloudVendor);
		return cloudVendorobject;
	}

	@Override
	public List<CloudVendor> getVendorListByName(String vendorName) {
		List<CloudVendor> cloudVendorobject=cloudVendorRepository.getByVendorName(vendorName);
		
		return cloudVendorobject;
	}

//	@Override
//	public List<CloudVendor> createAllCloudVendor(List<CloudVendor> cloudVendor) {
//		List<CloudVendor> cloudVendorobject=cloudVendorRepository.save(cloudVendor);
//		return cloudVendorobject;
//	}
	

}
