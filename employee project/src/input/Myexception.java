package input;

public class Myexception extends Exception {

	public Myexception(String message) {
	System.out.println(message);
	try {}
	catch(Exception e)
	{
		System.out.println("Please try Again");
	}
	}}



