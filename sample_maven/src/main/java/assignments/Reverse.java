package assignments;

public class Reverse {
	
	int rev;
	int num;
	
	public Reverse(int rev, int num)
	{
		this.rev = rev;//initialize the instance variable
		this.num =num;
		
		while(num!=0)
		{
		this.rev = this.rev*10 + num%10;
		num = num/10;
		}
		
		
	}
	
	public Reverse()
	{
		this(0,389);
		System.out.println("The reverse of the number is "+rev);
	}

	public static void main(String[] args) 
	{
		
		Reverse obj = new Reverse();

	}

}
