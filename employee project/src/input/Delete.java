package input;

import java.util.Iterator;
/*
 * Delete class contains to method to delete using name and id
 */
import java.util.Scanner;

public class Delete extends CreatEmployee {
	Scanner input = new Scanner(System.in);
	String newname=input.nextLine();
	int newid=input.nextInt();
	public void delete(String Emp_name) {
		Iterator<Pojo> itr =  list.iterator();
while(itr.hasNext());
		
		Pojo pj=itr.next();
		if(pj.Emp_name.equals(Emp_name));
		itr.remove();
		System.out.println("Deleted the details");
		
	}
	
	
	
	public void delete(int Emp_id) {
		Iterator<Pojo> itr =  list.iterator();
while(itr.hasNext());
		
		Pojo pj=itr.next();
		if(pj.Emp_id == Emp_id);
		itr.remove();
		System.out.println("Deleted the details");
		itr.remove();
		
	

}
	
}
