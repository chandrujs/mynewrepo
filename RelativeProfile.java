package javaProgram;

class Relative {
	int Age;
	String Name;
	String Occupation;
	String Gender;
	double Salary;
	String Designation;
	
	public void setAge(int age){
		Age = age;
	}
	
	public Relative(String name){
		this.Name = name;
	}
	
	public void setOccu(String occupation){
		Occupation = occupation;
	}
	
	public void gender(String sex){
		Gender = sex;
	}
	
	public void getSalary(double sal){
		Salary = sal;
	}
	
	public void getDesignation(String Desig){
		Designation = Desig;
	}
	
	public void printer(){
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Gender: "+Gender);
		System.out.println("Occupation: "+Occupation);
		System.out.println("Designation: "+Designation);
		System.out.println("Salary: "+Salary);
		System.out.print('\n');
	}
}

public class RelativeProfile{
	public static void main(String []args){
		Relative rel1 = new Relative("Murali");
		Relative rel2 = new Relative("Gopalakrishnan");
		Relative rel3 = new Relative("Thulasigopal");
		
		rel1.setAge(58);
		rel1.gender("Male");
		rel1.setOccu("Central Govt Employee");
		rel1.getDesignation("Chief Manager");
		rel1.getSalary(75000.00);
		rel1.printer();
		
		rel2.setAge(60);
		rel2.gender("Male");
		rel2.setOccu("Central Govt Employee");
		rel2.getDesignation("Retd");
		rel2.getSalary(70000.00);
		rel2.printer();
		
		rel3.setAge(52);
		rel3.gender("Male");
		rel3.setOccu("Central Govt Employee");
		rel3.getDesignation("Lic Officer");
		rel3.getSalary(75000.00);
		rel3.printer();
	}
	
}