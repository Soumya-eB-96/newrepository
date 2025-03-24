package assignments;

public class CheckAddition extends ReturnAddition {
	
	int result;
	
	public void result()
	{
		result = super.add();
		System.out.println("The sum of a & b is "+result);
		//int num =result;
		
		if((result%10)==0)
		{
			System.out.println("The result is divisible by 10");
		}
		else
		{
			System.out.println("The result is not divisible by 10");
		}
	}

	public static void main(String[] args) {
		
		CheckAddition obj = new CheckAddition();
		obj.result();
	}

}
