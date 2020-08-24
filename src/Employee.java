import java.util.*;
public class Employee {

	int monthlyCost;
	String jobFunction;
	String name;
	List<Employee> reporters;
	
	public Employee(String jobFunction, String name, int monthlyCost, List<Employee> reporters) {
		this.jobFunction = jobFunction;
		this.name = name;
		this.monthlyCost = monthlyCost;
		this.reporters = reporters;
	}
	public List<Employee> getReporters() {
		return reporters;
	}


	public void setReporters(List<Employee> reporters) {
		this.reporters = reporters;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMonthlyCost() {
		return monthlyCost;
	}


	public void setMonthlyCost(int monthlyCost) {
		this.monthlyCost = monthlyCost;
	}


	public String getJobFunction() {
		return jobFunction;
	}


	public void setJobFunction(String jobFunction) {
		this.jobFunction = jobFunction;
	}

	public int totalCost() {
		return totalCostCalculator(this);
	}
	
		int totalCostCalculator(Employee e) {
		if (e.reporters == null) {
			return e.getMonthlyCost();
		}
		int t = e.getMonthlyCost();
		for (Employee e1: e.reporters) {
			t = t + totalCostCalculator(e1);
		}
		return t;
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
