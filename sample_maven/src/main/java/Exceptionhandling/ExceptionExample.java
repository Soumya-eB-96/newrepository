package Exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			int c = a/b;
		}
		catch(ArithmeticException e) // catch(Exception name variable name)
		{
			b=2;
			int c = a/b;
			System.out.println(c);
			System.out.println(e); // to see the exception, hold the variable on the try
		}
		/*finally
		{
			System.out.println("Exception");// mandatory execution if exception occured
		}*/

	}

}
