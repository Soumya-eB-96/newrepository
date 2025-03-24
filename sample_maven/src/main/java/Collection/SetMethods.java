package Collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		
		Set<String> a = new HashSet<String>();
		a.add("Red");
		a.add("Yellow");
		a.add("Green");
		a.add("Violet");
		a.add("Blue");
		System.out.println(a);
		
		Set<String> a1 = new HashSet<String>();
		a1.add("Amber");
		a1.add("Lime");
		a1.add("Lavender");
		
		a.addAll(a1);
		System.out.println(a);
		
		System.out.println(a.contains("Amber"));
		
		System.out.println(a1.containsAll(a));
		
		System.out.println(a.isEmpty());
		
		a.remove("Violet");
		System.out.println(a);
		
		a.removeAll(a1);
		System.out.println(a);
		
		a1.clear();
		System.out.println(a1);

	}

}
