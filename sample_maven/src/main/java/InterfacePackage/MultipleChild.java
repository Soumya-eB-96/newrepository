package InterfacePackage;

public class MultipleChild implements MultipleParentA,MultipleParentB {

	public static void main(String[] args) 
	{
		MultipleChild child = new MultipleChild();
		child.display();
		child.show();
             
	}

	@Override
	public void show() 
	{
		
		System.out.println("Print parent A");
	}

	@Override
	public void display() 
	{
		
		System.out.println("Print parent B");
	}

}
