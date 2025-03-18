package InterfacePackage;

public class Interface2 implements Interface1{

	public static void main(String[] args) 
	{
		Interface2 obj = new Interface2();
		obj.display();
		obj.show();
       
	}

	@Override
	public void display() {
		
		System.out.println("Print display method");
		
	}

	@Override
	public void show() {
		
		System.out.println("Print show method");
		
		
	}

}
