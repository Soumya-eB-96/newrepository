package agreggation;

public class Aggregation2Child {
	
	String city;
	String state;
	AggregationParent1 ref;// reference variable
	
	public Aggregation2Child(String city,String state,AggregationParent1 ref)
	{
		this.city = city;
		this.state = state;
		this.ref = ref;
	}
	public void display()
	{
		System.out.println("Student name is "+ref.name+" and rollno "+ref.rollno);
		System.out.println("From "+city+" "+state);
	}
	

	public static void main(String[] args) 
	{
		AggregationParent1 obj = new AggregationParent1("soumya",35,15);
		Aggregation2Child obj1 = new Aggregation2Child("Thrissur","Kerala",obj);
		obj1.display();
		

	}

}
