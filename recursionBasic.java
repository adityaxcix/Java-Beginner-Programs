package in.oops;
public class recursionBasic
{
    static void print()
    {
        System.out.println("1");
        print1();
    }
    static void print1()
    {
        System.out.println("2");
        print2();
    }
    static void print2()
    {
        System.out.println("3");
        print3();
    }
    static void print3()
    {
        System.out.println("4");
        print4();
    }
    static void print4()
    {
        System.out.println("5");

    }



    public static void main(String[] args)
    {
        recursionBasic p = new recursionBasic();
    print();

    }
}
