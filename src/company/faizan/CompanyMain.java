package company.faizan;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class CompanyMain {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext f = new FileSystemXmlApplicationContext("companyfaiz.xml");
		Company c = f.getBean("com", Company.class);
		TC t=f.getBean("tc", TC.class);
		System.out.println(t.tc);
		c.showEmployee();
	
		
	}

}
