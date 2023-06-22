package in.programs;

public class Swap2Numbers_8 {

	public static void main(String[] args)
	{
		//Swapping without a third variable
		
		int a,b;
		a=1;
		b=2;
		a=a+b; // 1=1+2  ==3
		b=a-b; // 2=3-2  ==1b
		a=a-b; // 3=3-1  ==2a
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------------------------------------------------");
		//Swapping with third variable
	int num1=4, 
		num2=5,
		num3;
		num3=num1;
		num1=num2;
		num2=num3;
		System.out.println(num1);
		System.out.println(num2 );
		
		

	}

}
