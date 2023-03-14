package com.tw.sohel.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con = new ClassPathXmlApplicationContext("com/tw/sohel/beanscope/beanscope.xml");

		// Singleton...
		BeanScope b1 = con.getBean("beanFirst", BeanScope.class);
		System.out.println(b1.hashCode());

		BeanScope b2 = con.getBean("beanFirst", BeanScope.class);
		System.out.println(b2.hashCode());

		// Prototype...
		BeanScope b3 = con.getBean("beanSecond", BeanScope.class);
		System.out.println(b3.hashCode());

		BeanScope b4 = con.getBean("beanSecond", BeanScope.class);
		System.out.println(b4.hashCode());
	}

}
