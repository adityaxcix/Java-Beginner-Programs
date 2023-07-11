package listPractice;
import java.util.Scanner;
public class Multiply_Without_Operator
{
    public static void main(String[] args)
    {
        Scanner obj1  = new Scanner(System.in);
        System.out.println("Enter 1st nubmer");
        int num1 = obj1.nextInt();

        Scanner obj2 = new Scanner(System.in);
        System.out.println("Enter 2nd number");
        int num2 = obj2.nextInt();

        int sum = 0;
        for(int i =1;i<=num1;i++)
        {
            sum = sum+num2;
        }
        System.out.println(num1 + " x " + num2 + " = " +sum);







    }
}
