package Abstraction;

public class AbstractionChild extends AbstractionParent {
	
	public void show2()
	{
		
		System.out.println("print show2");
	}

	public static void main(String[] args) 
	{
		/*AbstractionChild abs = new AbstractionChild();
		abs.display();
		abs.show();
		abs.show2();*/
		
		AbstractionParent obj = new AbstractionChild();// reference creation
		obj.show();
		obj.display();

	}

	@Override
	public void display() {
		
		System.out.println("Absract method on parent");
		
	}

}
