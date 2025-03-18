package assignments;

public class Factorial {
	
	int factorial;
	int number;
	
	public void find(int number)
	{
		this.factorial = 1;
		this.number = number;
		
		for(int i=1;i<=number;i++)
		{
			this.factorial = this.factorial*i;
		}
	}
	public void print()
	{
		this.find(5);
		System.out.println("The factorial of the number is "+factorial);
	}

	public static void main(String[] args) 
	{
		Factorial fact = new Factorial();
		fact.print();
	}

}
