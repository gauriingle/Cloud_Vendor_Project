package com.sprinboot.app.service;

import java.util.List;

import com.sprinboot.app.model.CloudVendor;

public interface CloudVendorService {
	
	public CloudVendor createCloudVendor(CloudVendor cloudVendor);
	public String updateCloudVendor(CloudVendor cloudVendor);
	public String deleteCloudVendor(String cloudeVendorId);
	public CloudVendor getCloudVendor(String cloudVendor);
	
	public List<CloudVendor> getAllCloudVendor();
	public List<CloudVendor> createAllCloudVendor(List<CloudVendor> cloudVendor);
	public List<CloudVendor> getVendorListByName(String vendorName);

}
