import java.util.Scanner;
/*
 * 1. Create a vehicle class - you can google for it's attributes and behaviors
   2. Create at least 2 instance methods 
   3. Create main function inside the same class
   4. Create 5 vehicle objects 
   5. Create at least 4 constructors including a default constructor that doesn't do anything(meaning, the default constructor sets everything to JVM's default values)
 	Author:Clarissa Mercado
 	Date: 8-02-18
 */
public class Vehicle {
	//Declaring class attributes
	String color;
	String brand;
	String type;
	int numDoors;
	int mpg;
	double safteyRating;
	int horsepower;

	
//Creating constructors (4)
	//Default
	Vehicle(){
	}
	//Basic vehicle needs
	Vehicle(String color, String brand, String type){
		this.color = color;
		this.brand = brand;
		this.type = type;
	}
	//Attributes a family will ask about when searching for a car
	Vehicle(String color, String brand, String type, int numDoors, int mpg, double safteyRating){
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.numDoors = numDoors;
		this.mpg = mpg;
		this.safteyRating = safteyRating;
	}
	//Attributes a speed demon will ask about 
	Vehicle(String color, String brand, String type, int mpg, int horsepower){
		this.color = color;
		this.brand = brand;
		this.type = type;
		this.mpg = mpg;
		this.horsepower = horsepower; 
	}

	//instance method 1
	void compare(Vehicle another){
		//tom.compareSalary(ron);
		if(this.mpg > another.mpg)
			System.out.print(this.brand + ("\'s have better fuel economy than " + another.brand));
	}
	//instance method 2
	void better(Vehicle better){
		//tom.compareSalary(ron);
		if(this.safteyRating > better.safteyRating)
			System.out.print(this.brand + "has a better saftey rating than" + better.brand);
	}

	//Print instance methods
	//(String color, String brand, String type)
	public String toString(){
		return("Color: " + this.color + "Brand: " + this.brand + "Type: " + this.type);
	}
	//(String color, String brand, String type, int numDoors, int mpg, int safteyRating
	public String toString2(){
		return("Color: " + this.color + "Brand: " + this.brand + "Type: " + this.type + "Number of doors: " + 
				this.numDoors + "MPG: " + this.mpg + "Saftey Rating: " + this.safteyRating);
	}
	//(String color, String brand, String type, int mpg, int horsepower)
	public String toString3(){
		return("Color: " + this.color + "Brand: " + this.brand + "Type: " + this.type + "MPG: " + this.mpg +
				"Horsepower: " + this.horsepower);
	}
	
//2 instance methods
	
	//main method inside the same class 
	public static void main(String args[]) {
	
		//creating (5) objects
			//(String color, String brand, String type)
			Vehicle Car1 = new Vehicle("Rose Gold", "Infinit", "Crossover");
			Vehicle Car2 = new Vehicle("Perl White", "Toyota", "Hatchback");
			//(String color, String brand, String type, int numDoors, int mpg, int safteyRating
			Vehicle Car3 = new Vehicle("Silver", "Subaru", "SUV", 4, 32, 10);
			Vehicle Car4 = new Vehicle("Burgundy", "Hyundai", "Mid-Size", 4, 36, 7.5);
			//(String color, String brand, String type, int mpg, int horsepower)
			Vehicle Car5 = new Vehicle("Fiery Red", "Bugatti", "coupe", 30, 1190);
		
		//Title
		System.out.println("Car Recommendations");
			
		String oneOutput = Car1.toString();
		String twoOutput = Car2.toString();
		String threeOutput = Car3.toString2();
		String fourOutput = Car4.toString3();
		String fiveOutput = Car5.toString3();
		
		Scanner cust = new Scanner(System.in);
		System.out.println("What are you looking for in a car? Please choose from one of the following: " +
				"simple, family, or fast.");
			String ans1 = cust.next();
			if (ans1.equals("simple")){
				System.out.println("We have two options in mind.");
				System.out.println("Option 1: " + oneOutput + " Option 2: " + twoOutput);
			}

			else if (ans1.equals("family")) {
				System.out.println("We have two options in mind.");
				System.out.println("What is more important to you mpg or saftey?");
					String ansA = cust.next();
					if(ansA.equals("mpg")) {
						Car4.compare(Car3);
					}
					else if(ansA.equals("saftey")){
						Car3.better(Car4);
					}
					else {
						System.out.print("Both are great options! " + oneOutput + "" +  twoOutput);
					}
			}
			else if (ans1.equals("fast")){
				System.out.println("We recommend: " + fiveOutput + " It was chosen as one of the Top 10 Fastest Cars in 2018.");
					
			}
			else {
				System.out.println("Thank you for stopping by.");
			}
		
			 
	System.out.println("Have a good day.");
		
	}

	
}
