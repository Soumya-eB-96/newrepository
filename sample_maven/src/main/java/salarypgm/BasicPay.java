package salarypgm;

import java.util.Scanner;

public class BasicPay {  // parent A
	
	int Basic;
	int Deduction;
	int bonus;

	public void Employee()
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the basic pay :");
		Basic = sc.nextInt();
		System.out.println("Enter the deduction :  ");
		Deduction = sc.nextInt();
		System.out.println("Enter the Bonus : ");
		bonus = sc.nextInt();
		
		sc.close();
	}
	
	
}
