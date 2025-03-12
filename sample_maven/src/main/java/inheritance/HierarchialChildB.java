package inheritance;

public class HierarchialChildB extends HierarchialParent {

	public void display2()
	{
		System.out.println("Child B");
	}

	public static void main(String[] args) {
		
		HierarchialChildB obj = new HierarchialChildB();
		obj.display2();
		obj.display();

	}
}
