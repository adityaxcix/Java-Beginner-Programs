package task_21Sept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates_numbers 
{

	public static void main(String[] args)
	{

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(11);
		list1.add(12);
		list1.add(3);
		list1.add(4);
		list1.add(51);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(51);
		list2.add(60);
		list2.add(7);
		list2.add(8);
		list2.add(9);
		
		Set<Integer> set1 = new HashSet<Integer>(list1);
		Set<Integer> set2 = new HashSet<Integer>(list2);
		
		
		Set<Integer> unique1 = new HashSet<Integer>(set1);
		Set<Integer>unique2 = new HashSet<Integer>(set2);
		
		unique1.removeAll(set2);
		unique2.removeAll(set1);
		
		unique1.addAll(unique2);
		for(Integer i : unique1)
		{
			System.out.print(i+" ");
		}
		
	}

}
