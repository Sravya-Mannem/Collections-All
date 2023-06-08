package Collections;

import java.util.ArrayList;

//import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Hashset");
		int size = sc.nextInt();
		
		IntStream.range(0, size).forEach(num->{
			System.out.println("Enter the "+num+"th element");
			hs.add(sc.nextInt());
		});
		
		
//		System.out.println("Enter the number");
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
//		hs.add(sc.nextInt());
		
//		System.out.println(hs.size());
//		System.out.println(hs.isEmpty());
		
//		Collections.sort(hs);
		System.out.println((hs));
		
		hs.remove(0);
		hs.remove(12);
		System.out.println(hs);
		
		List<Integer> list_hash=new ArrayList<>(hs);
		
		Collections.sort(list_hash);
		System.out.println(list_hash);
		
		for(int i=0;i<hs.size();i++)
		{
			System.out.println(list_hash.get(i));
		}
		
	}

}
