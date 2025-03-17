package Abstraction;

public class AbstractionChild extends AbstractionParent {

	public static void main(String[] args) 
	{
		AbstractionChild abs = new AbstractionChild();
		abs.display();
		abs.show();

	}

	@Override
	public void display() {
		
		System.out.println("Absract method on parent");
		
	}

}
