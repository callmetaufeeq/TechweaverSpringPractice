package com.tw.sohel;

import com.tw.pojo.EMI;
import com.tw.service.Insurance;

public class CarInsurance implements Insurance{
	private String carName;
	private String carModel;
	private int carPrice;
	private int carEmi;
	private EMI e;
	

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public int getCarEmi() {
		return carEmi;
	}

	public void setCarEmi(int carEmi) {
		this.carEmi = carEmi;
	}

	@Override
	public String showInsurance() {
		// TODO Auto-generated method stub
		return "Your car details : " +carName+" " + carModel + " " + carPrice + " / EMI is : " + carEmi;
	}

	@Override
	public EMI getE() {
		// TODO Auto-generated method stub
		return e;
	}

	public void setE(EMI e) {
		this.e = e;
	}
	
	

	
}
