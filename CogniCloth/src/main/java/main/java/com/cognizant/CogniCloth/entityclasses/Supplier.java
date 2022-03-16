package main.java.com.cognizant.CogniCloth.entityclasses;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Supplier")

public class Supplier {
	
	@Id
	@Column(name="supplierid")
	private int supplierID;
	
	@Column(name="companyname",length=40)
	private String companyName;
	
    @Column(name="contactname",length=40)
	private String contactName;
	
	public Supplier() {
		
	}

	public int getSupplierID() {
		return supplierID;
	}

	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
}
