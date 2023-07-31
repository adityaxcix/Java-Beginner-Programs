package _31_07_23_;

import java.awt.print.Printable;

class animal 
{
	public void print()
	{
		System.out.println("This is animal");
	}
}




public class PolymorphismConcept extends animal
{
	//Overloading
	public static int sum(int a , int b)
	{
		return a+b;
	}
	
	public static int sum (int a, int b, int c)
	{
		return a-b-c;
	}
	
	
	//Over Riding

	public void print()
	{
		System.out.println("This is not animal");
	}

	
	
	
	public static void main(String[] args) 
	{
		
		System.out.println(sum(12, 23));
		System.out.println(sum(12,5,5));
		PolymorphismConcept P1 = new PolymorphismConcept();
		P1.print();
	}

}
