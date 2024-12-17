package com.abhi.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_details")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int rollNo;
	
	@Column(name = "student_name",length = 540)
	String name;
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="city",
                           column=@Column(name="home_city")),
        @AttributeOverride(name="addressLine1",
                           column=@Column(name="home_address_line1")),
        @AttributeOverride(name="addressLine2",
        column=@Column(name="home_address_line2"))
    })
	Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
        @AttributeOverride(name="city",
                           column=@Column(name="hostel_city")),
        @AttributeOverride(name="addressLine1",
                           column=@Column(name="hostel_address_line1")),
        @AttributeOverride(name="addressLine2",
        column=@Column(name="hostel_address_line2"))
    })
	Address hostelAddress;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getHostelAddress() {
		return hostelAddress;
	}

	public void setHostelAddress(Address hostelAddress) {
		this.hostelAddress = hostelAddress;
	}
	
	
}
