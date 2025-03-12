package superkeyword;

public class SupervariableChild extends SuperVariable{
	
	String color = "Black";
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);// access the variable from parent
	}

	public static void main(String[] args) {
		
		
		SupervariableChild obj = new SupervariableChild();
		obj.display();

	}

}
