/*
 * Create a class employee and follow guidelines give
 * Author:Clarissa Mercado
 * Date: 8/1/18
 * 
 * 1. create class function
 * 2.Employees are going to have a string name, int employeeID, double salary, String payRate, String joinDate,
 * 	String type[]Employee and int hours
 *3.All the attributes are private 
 * 4. When initially hired, some employees may not have an employee ID for hours. Some employees may have values for all
 * 	Create constructors accordingly. 
 *  5.The above mentioend constructors are the only 2 that are allowed. So, while creating an object of 
 *  	class Employee, you will be using one of the 2 constructors that you created. (Hint: Do not write the 
 *  	defau
 *  
 *  
 *  \lt constructor 
 *  6.Write the toString method 
 *  7.Create another class called Payroll in the same project and leave it blank  
 *
 */
import java.util.Scanner;
public class Employee {
	
	//declaring attributes
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getPayRate() {
		return payRate;
	}

	public void setPayRate(String payRate) {
		this.payRate = payRate;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getTypeOfEmployee() {
		return typeOfEmployee;
	}

	public void setTypeOfEmployee(String typeOfEmployee) {
		this.typeOfEmployee = typeOfEmployee;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getSalary() {
		return salary;
	}

	private int employeeID;
	private double salary;
	private String payRate;
	private String joiningDate;
	private String typeOfEmployee;
	private int hours;
	private String ssn;
	
	//in parenthese what you want to return 
	void setSalary(double newSalary) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your HR Code to set the salary");
		int hrCode = sc.nextInt();
		if (hrCode == 3391) {
			this.salary = newSalary;
		}
		else {
			System.out.println("You do not have permission.");
		}
	}
	
	//creating constructors 
	Employee (String name, double salary, String payRate, String joiningDate, String typeOfEmployee){
		this.name = name;
		this.salary = salary;
		this.payRate = payRate;
		this.joiningDate = joiningDate;
		this.typeOfEmployee = typeOfEmployee;
	
	}
	Employee (String name, int employeeID, double salary, String payRate, String joiningDate, String typeOfEmployee, int hours){
		this.name = name;
		this.employeeID = employeeID;
		this.salary = salary;
		this.payRate = payRate;
		this.joiningDate = joiningDate;
		this.typeOfEmployee = typeOfEmployee;
		this.hours = hours;
	}
	/*
	public String toString() {
		return ("Name:" + this.name + "\n" + "Employee ID: " + this.employeeID + "\n" + "Salary:" + this.salary + "\n" + "Pay Rate:" + this.payRate + "\n" + "Join Date:" + this.joiningDate + "\n" + "Type of Employee: " + this.typeOfEmployee + "\n" + "Hours: " + this.hours);
	}
	*/
	
	//compare salary of one object to another 
	void compare(Employee another){
		//tom.compareSalary(ron);
		if(this.salary > another.salary)
			System.out.print("Salary greater");
	}
	
	//
	boolean isSalaryHigher(Employee that) {
		//
		if(this.salary > that.salary){
			return true;
		}
		else {
			return false;
		}
	}
	

}
