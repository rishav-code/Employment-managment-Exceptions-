package input;

import java.util.ArrayList;

import java.util.Scanner;
/*
 * CreatEmployee class used to take input from user and store in a ArrayList
 */
 
public class CreatEmployee {
	static ArrayList <Pojo> list = new ArrayList<Pojo>();
	public void creatmethod() throws Myexception {
	
		
Scanner input = new Scanner(System.in);

System.out.println("Enter the Proffessional details of the employee");
System.out.println("Enter Employee Name");
String Emp_Name=input.nextLine();
input.nextLine();


	System.out.println("Enter Employee Id");
	int Emp_Id=input.nextInt();
	if(Emp_Id==0) {
		throw new Myexception("Employee Id cant be zero");
	}
	input.nextLine();
System.out.println("Enter Employee Department");
String Emp_Department=input.nextLine();
System.out.println("Enter Employee Designation");
String Emp_Designation=input.nextLine();
System.out.println();
System.out.println("Enter the Personal details of the employee");
System.out.println("Enter Employee Gender ");
String Emp_gender=input.nextLine();
System.out.println("Enter Employee Address");
String Emp_adds=input.nextLine();
System.out.println("Enter Employee Age");
int Emp_age=input.nextInt();
list.add(new Pojo (Emp_Name,Emp_Id,Emp_Department,Emp_Designation,Emp_gender,Emp_adds,Emp_age ));
System.out.println("Size=  "+list.size());
System.out.println("Empcreated");
	}
}

