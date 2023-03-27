package Patterns;

import java.util.Scanner;

public class GreatestNUm
{
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        int A = obj1.nextInt();
        int B = obj1.nextInt();
        int C =obj1.nextInt();

        if(A>B && A>C)
        {
            System.out.println(A+": is Greater ");
        }
        else if (B>A && B>C)
        {
            System.out.println(B+" : is Greater");
        }
        else
        {
            System.out.println(C+" : is Greater");
        }
    }
}
