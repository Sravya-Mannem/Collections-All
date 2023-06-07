package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linkedhshmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
		
		lhm.put(1, "Sravya");
		lhm.put(2, null);
		lhm.put(23, null);
		lhm.put(1, "xyz");
		lhm.put(5, "pqr");
		
		System.out.println(lhm);
		
		lhm.remove(1);
		lhm.remove(23,null);
		System.out.println(lhm);
		
//		Collections.sort(lhm);
	
//		System.out.println(lhm.get(1)+" "+lhm.getOrDefault(5, "pqr"));
		
//		for(int i=0;i<lhm.size();i++)
//		{
//			System.out.println(lhm.get(i));
//		}
		
		for(Map.Entry<Integer, String> m1 : lhm.entrySet())
		{
			System.out.println(m1.getKey()+" : "+m1.getValue());
		}

	}

}
