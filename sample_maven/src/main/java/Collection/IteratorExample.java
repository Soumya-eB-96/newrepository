package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		
		Set<String> std = new HashSet<String>();
		std.add("name");
		std.add("class");
		std.add("roll no");
		System.out.println(std);
		
		Iterator it = std.iterator();// create object for iterator
		
		while(it.hasNext())// find the next element
		{
			System.out.println(it.next());
		}
		
		it.remove();
		System.out.println(std);
		
		
	}

}
