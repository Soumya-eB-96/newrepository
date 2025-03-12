package inheritance;

public class MultilevelChildC extends MultilevelParentB{
	
	public void sample2()
	{
		System.out.println("child C");
	}

	public static void main(String[] args) {
 
		MultilevelChildC obj = new MultilevelChildC();
		obj.sample();
		obj.sample1();
		obj.sample2();
	

	}

}
