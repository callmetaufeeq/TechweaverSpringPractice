package com.tw;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.tw.service.Insurance;

public class MainClass {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext context=new FileSystemXmlApplicationContext("spring.xml");
		Insurance in=context.getBean("bike",Insurance.class);
		System.out.println(in.showInsurance());
		System.out.println(in.getE().showEMI());
		context.close();
	}

}
