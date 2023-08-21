package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hset {

	public static void main(String[] args) {
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(56);
		s1.add(42);
		s1.add(90);
		s1.add(76);
		s1.add(32);
		s1.add(90);
		s1.add(42);

		// 32 56 42 90 76 - 1st

		System.out.println("Hashset");
		Iterator<Integer> itr = s1.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println();

		System.out.println("======================================================================");

		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(55);
		aList.add(31);
		aList.add(55);
		aList.add(31);
		aList.add(67);
		aList.add(90);
		aList.add(67);
		aList.add(90);
		
		Iterator L_itr = aList.iterator();
		while(L_itr.hasNext())
		{
			System.out.print(L_itr.next()+" ");
			
		}
		System.out.println();
		Set<Integer> hs1 = new HashSet<Integer>(aList);
		System.out.println(hs1);
		
		
		
		

	}
}
