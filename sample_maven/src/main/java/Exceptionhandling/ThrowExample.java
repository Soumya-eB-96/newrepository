package Exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		
		int n=15;
		if(n>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Age under 18");
		}
	}

}
