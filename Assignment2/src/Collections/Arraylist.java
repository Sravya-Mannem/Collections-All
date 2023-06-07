package Collections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

	public static void main(String args[])
	{
		List<String> al= new ArrayList<>();
		
		al.add("xyz");
		al.add("abc");
		al.add("def");
		al.add("pqr");
		al.add(0,"Sravya");
		
		System.out.println(al);
		
		al.remove(al.size()-1);
		al.remove("Sravya");
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		for(String name : al)
		{
			System.out.println(name);
		}
	}

}
