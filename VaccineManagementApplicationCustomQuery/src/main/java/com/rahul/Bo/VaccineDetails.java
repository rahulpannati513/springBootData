package com.rahul.Bo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VaccineInformation")
public class VaccineDetails {
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="VACCINENAME")
	private String vaccineName;
	
	@Column(name="VACCINECOMPANY")
	private String vaccineCompany;

	private Long price;
	
	
	public VaccineDetails(long id, String vaccineName, String vaccineCompany,Long price) {
		super();
		this.id = id;
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.price =price;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public VaccineDetails() {
		System.out.println("Vaccine zero param constructor...");
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	@Override
	public String toString() {
		return "VaccineDetails [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany
				+ ", price=" + price + ", getPrice()=" + getPrice() + ", getId()=" + getId() + ", getVaccineName()="
				+ getVaccineName() + ", getVaccineCompany()=" + getVaccineCompany() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
