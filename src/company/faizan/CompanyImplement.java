package company.faizan;

import java.util.ArrayList;
import java.util.List;

public class CompanyImplement implements Company {

	ArrayList<String> emp;
	List<Double> salary;
	public TC currentTc;

	public TC getCurrentTc() {
		return currentTc;
	}

	public void setCurrentTc(TC currentTc) {
		this.currentTc = currentTc;
	}

	public ArrayList<String> getEmp() {
		return emp;
	}

	public void setEmp(ArrayList<String> emp) {
		this.emp = emp;
	}

	public List<Double> getSalary() {
		return salary;
	}

	public void setSalary(List<Double> salary) {
		this.salary = salary;
	}


	@Override
	public void showEmployee() {
		System.out.println("hi");
		System.out.println(emp);
		System.out.println(salary);
			}

	@Override
	public void showExpenditure() {

	}

	@Override
	public void showProfit() {

	}

}
