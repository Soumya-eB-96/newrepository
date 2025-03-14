package encapsulation;

public class Encapse1 {
	
	private String name;
	private int age;
	
	
	public void Set(String name, int age)// for encapsulation should use the two methods
	{
		this.name = name;
		this.age = age;
	}
	
	public void Get()
	{
		System.out.println("The name is "+name+" and age is "+age);
	}

}
