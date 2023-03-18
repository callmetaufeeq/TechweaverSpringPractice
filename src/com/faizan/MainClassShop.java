package com.faizan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClassShop {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext a = new FileSystemXmlApplicationContext("faizan.xml");
		Shop s = a.getBean("shop", Shop.class);
		s.showEmployee();
		s.showBill();
		s.greeting();
		System.out.println(s.greeting());

		System.out.println();

		SingletonBean sb1 = a.getBean("singleton", SingletonBean.class);
		System.out.println("Hashcode of singleton bean 1 is " + sb1.hashCode());
		SingletonBean sb2 = a.getBean("singleton", SingletonBean.class);
		System.out.println("Hashcode of singleton bean 2 is " + sb2.hashCode());
		System.out.println();

		ShopImplement s1 = a.getBean("prototype", ShopImplement.class);
		System.out.println("Hashcode of protoype bean 1 is " + s1.hashCode());
		ShopImplement s2 = a.getBean("prototype", ShopImplement.class);
		System.out.println("Hashcode of protoype bean 2 is " + s2.hashCode());
	}

}
