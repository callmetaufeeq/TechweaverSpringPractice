package com.tw.service;

import com.tw.pojo.EMI;
import com.tw.pojo.Offer;

public class BikeInsurance implements Insurance {
	
	private int id;
	
	private String name;
	private int validity;
	private Offer offer;
	private EMI e;
	
	public BikeInsurance(String name, int validity, Offer offer) {
		super();
		this.name = name;
		this.validity = validity;
		this.offer = offer;
		System.out.println(offer.getOffer());
	}

	@Override
	public String showInsurance() {
		return "Your bike is insured " +id+" "+name+" "+validity ; 
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public EMI getE() {
		return e;
	}

	public void setE(EMI e) {
		this.e = e;
	}

		
} 

