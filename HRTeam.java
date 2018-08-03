import java.util.*;

public class HRTeam {
	public static void main(String args[]) {
		
		//both of them have all other attributes
		//Joey 
		//Rachel 
		//employeeID, double salary, String payRate, String joiningDate, String typeOfEmployee, int hours){
		
		Employee someEmployee = new Employee("Joey", 1234 , 44.90, "Hourly", "09-01-2016", "PART-TIME", 100);
		
		//this is wehre getters and setters come into picture 
		System.out.println(someEmployee.getSsn());
			if(someEmployee.getSsn()== null) {
					Scanner sc = new Scanner(System.in);
					System.out.println("What is " + someEmployee.getName() + "'s SSN");
					someEmployee.setSsn(sc.nextLine());
			}
			System.out.println(someEmployee.getSsn());
	}
	
}
