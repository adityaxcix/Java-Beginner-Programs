package _31_07_23_;

class Grandfather
{
	void walks()
	{
		System.out.println("Walks : Method in Grandfather");
	}
}

class Father extends Grandfather
{
	void sleeps()
	{
		System.out.println("Sleeps : Method in Father");
	}
}

class Son extends Father
{
	void eats()
	{
		System.out.println("Eats : Method in Son");
	}
}

class Daughter extends Father
{
	void runs()
	{
		System.out.println("Runs : Method in Daughter");
	}
}



public class InheritanceMultiLevel extends Grandfather

{

	public static void main(String[] args)
	{
	
		Daughter d1 = new Daughter();
		d1.runs();
		d1.walks();
		d1.sleeps();
		d1.runs();

	}

}
