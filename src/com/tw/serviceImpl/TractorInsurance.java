package com.tw.serviceImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.tw.pojo.EMI;
import com.tw.service.Insurance;

public class TractorInsurance implements Insurance {
	private Map<String, String> map;
	
	public TractorInsurance(List<String> names,Set<String> brands, Map<Integer, String> m) {
		for (String s : names) {
			System.out.println("Names of tractor: "+s);
		}
		
		for (String b : brands) {
			System.out.println("Names of Brands: "+b);
		}
		
		 for (Map.Entry<Integer,String> e : m.entrySet()) {
			 System.out.println(e.getKey() +" "+e.getValue());
		 }
	}

	@Override
	public String showInsurance() {
		System.out.println(getMap());
		return "Tractor insurance";
	}

	@Override
	public EMI getE() {
		return null;
	}

	public void startTr(){
		System.out.println("Started");
	}
	
	public void endTr(){
		System.out.println("ended");
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "TractorInsurance [map=" + map + "]";
	}
	
	
}
