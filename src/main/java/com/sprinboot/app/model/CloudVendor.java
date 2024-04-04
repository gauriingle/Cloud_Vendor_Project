package com.sprinboot.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor {
	
	@Id
	private String vendorId;
	private String vendorName;
	private String vendorAddess;
	private String vendorPhoneNumber;
	public String getVendorId() {
		return vendorId;
	}
	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorAddess() {
		return vendorAddess;
	}
	public void setVendorAddess(String vendorAddess) {
		this.vendorAddess = vendorAddess;
	}
	public String getVendorPhoneNumber() {
		return vendorPhoneNumber;
	}
	public void setVendorPhoneNumber(String vendorPhoneNumber) {
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	public CloudVendor(String vendorId, String vendorName, String vendorAddess, String vendorPhoneNumber) {
		super();
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorAddess = vendorAddess;
		this.vendorPhoneNumber = vendorPhoneNumber;
	}
	public CloudVendor() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
