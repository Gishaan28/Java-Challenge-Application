import java.util.*;
public class Department {
	
	String deptName;
	List<Employee> employees;
	
	Department(String deptName, List<Employee> employees) {
		this.deptName = deptName;
		this.employees = employees;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public int montlyExpense() {
		int totalExpense = 0;
		for (Employee e: employees) {
			totalExpense += e.getMonthlyCost();
		}
		return totalExpense;
	}
	
	public List<String> managerWithNoReporter() {
		List<String> empList = new ArrayList<String>();
		for (Employee e: employees) {
			if (e.getJobFunction() == "Manager" && e.reporters == null) {
				empList.add(e.getName());			
			}
		}
		return empList;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
