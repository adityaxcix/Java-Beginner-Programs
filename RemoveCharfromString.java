package stringWords;

import java.util.Scanner;

public class RemoveCharfromString 
{
	static String modify(String s)
	{
		char a[]= s.toCharArray();
		char b[] = new char[a.length];
		int i =0;
		int j =0;
		while(i<a.length)
		{
			if(!Character.isLetter(a[i]))
			{
				b[j++]=a[i];
			}
			i++;
		}
		return String.valueOf(b);
		
	}
			public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(RemoveCharfromString .modify(str));

	}

}
