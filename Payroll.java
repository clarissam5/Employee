
public class Payroll {



	public static double calculatePay(Employee employee) {
			//Employee is class type and employee is the object 
			//switched void to double because we added a return value 
			//void return type when you don't want to return anything 
		/*Pay cycle is bi-weekly. This function will be calculating an employee's paycheck for the cycle 
		 * based on salary and payrate 
		 */
		
		employee.setSalary(90);
		
		double salary;
			//if the employee has a yearly salary
		//if(employee.payRate == "YEARLY") { 
		//vv below is the getter and setter format 
		  if(employee.getPayRate()== "YEARLY") {
			salary = (employee.getSalary()/52)*2;
		}
		else if(employee.getPayRate() == "Hourly") {
			salary = (employee.getSalary() * employee.getHours() * 2);
		}
		else {
			salary = 0.0;
		}
		return salary;
	}
	
	
	
	public static void main(String args[]) {
	    
		Employee Tom = new Employee("Tom Haveford", 1234 , 44.90, "Hourly", "09-01-2016", "PART-TIME", 100);
		Employee Ron = new Employee("Ron Weasely", 50000, "YEARLY", "09-01-2016", "PART-TIME");	
		
		System.out.println(calculatePay(Tom));
		System.out.println(calculatePay(Ron));
			
		//below is the statement invoking the method created in the Employee class
		Ron.compare(Tom);
		
		
			
	}
	
}
