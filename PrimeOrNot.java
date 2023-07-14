package BasicPrograms;

public class PrimeOrNot
{
    public static boolean checkPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {

        System.out.println(PrimeOrNot.checkPrime(43));


    }
}
