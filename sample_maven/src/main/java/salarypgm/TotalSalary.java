package salarypgm;

public class TotalSalary extends GetPay // child
{
	
	public void slip()
	
	{
		
		float total = (Basic+(HRA-pf-Deduction)+bonus);
		
		
		System.out.println("   Salary Slip   ");
		System.out.println("Basic pay : "+Basic);
		System.out.println("Deduction amount : "+Deduction);
		System.out.println("Bonus amount :"+bonus);
		System.out.println("hra : "+HRA);
		System.out.println("PF Amount : "+pf);
		System.out.println("Total salary :"+total);
		
}
	
	
public static void main(String[]args)
	{
		TotalSalary total = new TotalSalary();
		total.Employee();
		total.Allowance();
		total.slip();
	}
}

  
