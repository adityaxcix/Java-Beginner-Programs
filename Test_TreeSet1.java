package in.set;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.TreeSet;
public class Test_TreeSet1
{
	public static void main(String[] args) 
	{
		//TreeSet_Methods
		
		TreeSet<Integer> ts1 = new TreeSet<Integer>();
		ts1.add(45);
		ts1.add(2);
		ts1.add(4);
		ts1.add(56);
		ts1.remove(45);
		System.out.println("TreeSet 1 : "+ts1);
		
		TreeSet<Integer> ts2 = new TreeSet<Integer>();
		ts2.add(3);
		ts2.add(31);
		ts2.add(78);
		ts2.add(43);
		
		System.out.println("TreeSet 2 : "+ts2);
		System.out.println("\n");
		TreeSet<Integer> ts3 = new TreeSet<Integer>();
		ts1.addAll(ts2);
		ts3.addAll(ts1);
		System.out.println("ts1 : " + ts1);
		System.out.println("ts2 : "+ ts2);
		System.out.println("ts3 : "+ts3);
		System.out.println("\n");
		System.out.println("Ceiling : "+ts3.ceiling(50));
		System.out.println("Floor : "+ ts3.floor(30));
		System.out.println("\n");
		
		
		
		System.out.println("Descending Iterator");
		Iterator Descitr = ts3.descendingIterator();
		while(Descitr.hasNext())
		{
			System.out.print(Descitr.next()+ " ");
		}
		System.out.println("\n"+"Ascending Iterator");
		Iterator itr = ts3.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
		
		
		
		System.out.println("\n");
		System.out.println("Reverse order : "+ts3.descendingSet());
		
		System.out.println("Sorted HeadSet : "+ts3.headSet(43)); //Returns the set of values less than the specified number
		System.out.println("Higher : "+ts3.higher(56));
		System.out.println("Lower : " + ts3.lower(31));
		
		System.out.println("=======================================");
		System.out.println(ts3);
		System.out.println("Lowest Element : "+ ts3.pollFirst());
		System.out.println(ts3);
		System.out.println("=======================================");
		System.out.println(ts3);
		System.out.println("Highest Element : " + ts3.pollLast());
		System.out.println(ts3);
		System.out.println("=======================================");
		
		Spliterator<Integer> str = ts3.spliterator();
		str.forEachRemaining(n-> System.out.println("Square of "+n+" : "+n*n));
		
		System.out.println("\n");
		
		System.out.println("Range : "+ts3.subSet(2, 20));
		
		boolean isContaining = ts3.contains(4);
		System.out.println(isContaining);
		
		boolean isEmpty = ts3.isEmpty();
		System.out.println(isEmpty);
		
		boolean isRemoved = ts3.remove(56);
		System.out.println(isRemoved + " " + ts3);
		
		System.out.println("First element : "+ts3.first());
		System.out.println("Last  element : "+ts3.last());
		
		int size = ts3.size();
		System.out.println("Size : "+size);
		
	}
}
