package com.tnsif.sm.store1;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Store {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String description;
	    private String location;
	    private String contactInfo; // New field
	    private String operatingHours; // New field

	    // Getters and Setters
     public Store()
     {
    	 
     }
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public void setLocation(String location) {
	        this.location = location;
	    }

	    public String getContactInfo() {
	        return contactInfo;
	    }

	    public void setContactInfo(String contactInfo) {
	        this.contactInfo = contactInfo;
	    }

	    public String getOperatingHours() {
	        return operatingHours;
	    }

	    public void setOperatingHours(String operatingHours) {
	        this.operatingHours = operatingHours;
	    }

		public Store(Long id, String name, String description, String location, String contactInfo,
				String operatingHours) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.location = location;
			this.contactInfo = contactInfo;
			this.operatingHours = operatingHours;
		}
	    
	}
