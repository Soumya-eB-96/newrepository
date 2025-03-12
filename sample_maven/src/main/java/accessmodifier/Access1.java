package accessmodifier;

public class Access1 {
	
	public void display()
	{
		System.out.println("Public");
	}
	public void display1()
	{
		System.out.println("Private");
	}
	public void display2()
	{
		System.out.println("Protected");
	}
	public void display3()
	{
		System.out.println("Default");
	}


	public static void main(String[] args) {
		
		Access1 obj = new Access1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}

}
