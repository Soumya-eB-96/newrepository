package Exceptionhandling;

public class CustomException {

	public static void main(String[] args) throws VotingException {// throws : to declare an exception
		 int age = 15;
		 if (age>18)
		 {
			 System.out.println("Eligible");
		 }
		 else
		 {
			 throw new VotingException("Age under 18");// string parameterized constructor
		 }

	}

}
