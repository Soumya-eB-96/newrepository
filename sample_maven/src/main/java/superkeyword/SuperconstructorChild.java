package superkeyword;

public class SuperconstructorChild extends SuperConstructorparent{
	
	public SuperconstructorChild()
	{
		super(13, 14);// return values to parent ,
		System.out.println("Default constructor");
		
	}

	public static void main(String[] args) {
		
		SuperconstructorChild obj = new SuperconstructorChild();

	}

}
