package polymorphism;

public class ChildOverride extends ParentOverride{
	
	public void sum(int a, int b)
	{
		super.sum(12, 14);
		int c = a+b;
		System.out.println("Child sum is "+c);// override the child with parent so display only child. call parent through super key
	}

	public static void main(String[] args) {
		
		ChildOverride obj = new ChildOverride();
		obj.sum(20, 30);
		

	}

}
