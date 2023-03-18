package com.faizan;

import java.util.List;
import java.util.Map;

public class ShopImplement implements Shop {
	public ShopImplement() {

	}

	private void init() {

	}

	private List<String> emp;
	public Map<String, String> map;

	public ShopImplement(List<String> emp, Map<String, String> map) {
		this.emp = emp;
		this.map = map;

	}

	public List<String> getEmp() {
		return emp;
	}

	public void setEmp(List<String> emp) {
		this.emp = emp;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	@Override
	public void showEmployee() {
		System.out.println(emp);
	}

	@Override
	public void showBill() {
		System.out.println(map);
	}

	@Override
	public String greeting() {
		return " Visit Again :) ";
	}

}
