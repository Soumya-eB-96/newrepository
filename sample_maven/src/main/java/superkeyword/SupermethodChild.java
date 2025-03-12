package superkeyword;

public class SupermethodChild extends SuperMethod {
	
	public void display1()
	{
		System.out.println("Child extends parent method");
		super.display();
	}

	public static void main(String[] args) {
		
		SupermethodChild obj = new SupermethodChild();
		obj.display1();
	}

}
