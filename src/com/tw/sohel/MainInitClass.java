package com.tw.sohel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInitClass {

	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/tw/sohel/spring.xml");
		InitAndDestroy u1 = con.getBean("u1",InitAndDestroy.class);
		System.out.println(u1);
		
		
	}

}
