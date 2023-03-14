package com.tw.sohel.beanscope;

public class BeanScope {
	private String beanOne;
	private String beanTwo;

	public String getBeanOne() {
		return beanOne;
	}

	public void setBeanOne(String beanOne) {
		this.beanOne = beanOne;
	}

	public String getBeanTwo() {
		return beanTwo;
	}

	public void setBeanTwo(String beanTwo) {
		this.beanTwo = beanTwo;
	}

	@Override
	public String toString() {
		return "BeanScope [beanOne=" + beanOne + ", beanTwo=" + beanTwo + "]";
	}

}
