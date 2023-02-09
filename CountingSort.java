package programs;

public class CountingSort 
{
    public static int[] sort(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for (int i : arr) 
        {
            if (i > max) 
            {
                max = i;
            }
        }
        int[] count = new int[max + 1];
        for (int i : arr) 
        {
            count[i]++;
        }
        int k = 0;
        for (int i = 0; i <= max; i++) 
        {
            for (int j = 0; j < count[i]; j++)
            {
                arr[k++] = i;
            }
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        int[] arr = {4, 2, 5, 1, 3};
        int[] sortedArr = sort(arr);
        for (int i : sortedArr)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
