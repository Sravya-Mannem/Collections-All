package Collections;

import java.util.LinkedList;

public class Linkedlist {
	public static void main(String args[])
	{
		LinkedList <Integer> ll = new LinkedList<>(); 
		
		ll.add(12);
		ll.add(23);
		ll.add(35);
		ll.add(76);
		ll.add(34);
		ll.add(12);
		ll.add(65);
		ll.add(98);
		
//		System.out.println(ll.size());
		
		ll.remove(0);
		ll.add(0,100);
		System.out.println("1st element "+ll.peek());		
		System.out.println("Size of the LinkedList "+ll.size());
		System.out.println("Elements of the List : "+ll);
		
		for(Integer ele : ll)
		{
			System.out.println(ele);
		}
	}

}
