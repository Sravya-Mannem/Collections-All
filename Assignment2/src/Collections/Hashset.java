package Collections;

import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Hashset {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>();
		
		hs.add(32);
		hs.add(79);
		hs.add(23);
		hs.add(54);
		hs.add(100);
		hs.add(0);
		
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
//		Collections.sort(hs);
		System.out.println((hs));
		
		hs.remove(0);
		hs.remove(100);
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
