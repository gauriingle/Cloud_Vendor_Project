package com.sprinboot.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprinboot.app.model.CloudVendor;
import com.sprinboot.app.service.CloudVendorService;

@RestController
@RequestMapping("/cloudevendor")
public class CloudVendorController {
	
	CloudVendorService cloudVendorService;
	public CloudVendorController(CloudVendorService cloudVendorService) {
		
		this.cloudVendorService = cloudVendorService;
	}

	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(@PathVariable("vendorId")String vendorId)
	 {

		return cloudVendorService.getCloudVendor(vendorId);
//				new CloudeVendor("c1","vendor","Address one","12343234");
	 }
	
	@GetMapping("/getByVendorName/{vendorName1}")
	public List<CloudVendor> getVendorListByName(@PathVariable("vendorName1")String vendorName)
	 {

		List<CloudVendor> list =cloudVendorService.getVendorListByName(vendorName);
//				new CloudeVendor("c1","vendor","Address one","12343234");
		
		return list;
	 }
	
	
	//Read specific Cloud vendor Details
	@GetMapping
	public List<CloudVendor> getAllCloudVendorDetails()
	 {

		return cloudVendorService.getAllCloudVendor();
//				new CloudeVendor("c1","vendor","Address one","12343234");
	 }
	
	@PostMapping
	public CloudVendor createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		CloudVendor cloudVendor1=cloudVendorService.createCloudVendor(cloudVendor);
		
		return cloudVendor1;
	}
	
	@PostMapping("/createAll")
	public List<CloudVendor> createAllCloudVendorDetails(@RequestBody List<CloudVendor> cloudVendor)
	{
		List<CloudVendor> cloudVendor1=cloudVendorService.createAllCloudVendor(cloudVendor);
		
		return cloudVendor1;
	}
	
	
	@PutMapping
	
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
	{
		cloudVendorService.updateCloudVendor(cloudVendor);
		return "cloude vendor updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(@PathVariable("vendorId")String vendorId)
	{
		this.cloudVendor =null;
		return "cloude vendor deleted successfully";
	}
	
	

}
