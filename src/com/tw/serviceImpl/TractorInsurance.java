package com.tw.serviceImpl;

import com.tw.pojo.EMI;
import com.tw.service.Insurance;

public class TractorInsurance implements Insurance {

	@Override
	public String showInsurance() {
		return "Tractor insurance";
	}

	@Override
	public EMI getE() {
		// TODO Auto-generated method stub
		return null;
	}

	public void startTr(){
		System.out.println("Started");
	}
	
	public void endTr(){
		System.out.println("ended");
	}
}
