package input;
import java.util.Iterator;
import input.CreatEmployee;
/*
 * 
 *   Fetch contains methods to fetch usin name and id 
 */

public class Fetch extends CreatEmployee {
	
	
	Iterator<Pojo> itr =  list.iterator();
	public void fetch( int Emp_id)
	{
		//System.out.println("SIZE OF THE LIST"+list.size());
		while(itr.hasNext())
		{
		Pojo pj=itr.next();
		if(pj.Emp_id == Emp_id)
		{
		System.out.println("Personal Details of an Employee Are:");
		System.out.println(" ");
		System.out.println("Name:-"+pj.Emp_name  +" "+  " Age:-"+ pj.Emp_age +" "+ "Gender:-"+  pj.Emp_gender + " "+" Adds:-" +  pj.Emp_adds);
		System.out.println(" ");
		System.out.println("Professional Details of an Employee Are:");
		System.out.println("Id:-"+pj.Emp_id +" "+" name:- "+ pj.Emp_name+" "+" Department:- "+   pj.Emp_Department+" "+"Designation:-"+pj.Emp_Desiganation);
		}
		else {System.out.println("HEllo");}
		}
	}
	public void fetch( String Emp_name)
	{
		
		while(itr.hasNext())
		
		{
		Pojo pj=itr.next();
		if(pj.Emp_name. equals (Emp_name)) {
			System.out.println("Personal Details of an Employee Are:");
			System.out.println(" ");
			System.out.println("Name:-"+pj.Emp_name  +" "+  " Age:-"+ pj.Emp_age +" "+ "Gender:-"+  pj.Emp_gender + " "+" Adds:-" +  pj.Emp_adds);
			System.out.println(" ");
			System.out.println("Professional Details of an Employee Are:");
			System.out.println("Id:-"+pj.Emp_id +" "+" name:- "+ pj.Emp_name+" "+" Department:- "+   pj.Emp_Department+" "+"Designation:-"+pj.Emp_Desiganation);
		}
	}
	
	}
}
		
	