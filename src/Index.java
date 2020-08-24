import java.util.*;
public class Index {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee developer1 = new Employee("Developer", "Developer1", 2000, null);
		Employee developer2 = new Employee("Developer", "Developer2", 2000, null);
		Employee tester1 = new Employee("QATester", "QATester1", 1000, null);
		Employee tester2 = new Employee("QATester", "QATester2", 1000, null);
		List<Employee> reportersOfM1 = new ArrayList<Employee>();
		reportersOfM1.add(developer1);
		reportersOfM1.add(developer2);
		reportersOfM1.add(tester1);
		reportersOfM1.add(tester2);
		Employee manager1 = new Employee("Manager", "Manager1", 600, reportersOfM1);
		
		List<Employee> reportersOfM2 = new ArrayList<Employee>();
		reportersOfM2.add(manager1);
		Employee manager2 = new Employee("Manager", "Manager2", 600, reportersOfM2);
		
		List<Employee> reportersOfM3 = new ArrayList<Employee>();
		reportersOfM3.add(manager2);
		Employee manager3 = new Employee("Manager", "Manager3", 600, reportersOfM3);
		Employee manager4 = new Employee("Manager", "Manager4", 600, null);
		
		List<Employee> employeeInDept = new ArrayList<Employee>();
		employeeInDept.add(developer1);
		employeeInDept.add(developer2);
		employeeInDept.add(manager1);
		employeeInDept.add(manager4);
		Department dept1 = new Department("Department1", employeeInDept);
		
		System.out.println("Total Expenditure for Manager1 is: " + Integer.toString(manager1.totalCost()));
		System.out.println("Total Expenditure for Manager2 is: " + Integer.toString(manager2.totalCost()));
		System.out.println("Total Expenditure for Manager3 is: " + Integer.toString(manager3.totalCost()));
		System.out.println("Total Expenditure for Department1 is: " + Integer.toString(dept1.montlyExpense()));
		System.out.println("Managers with no one reporting to them in " + dept1.getDeptName() + " are " + dept1.managerWithNoReporter());
		
	}
}
