package programs;

public class SecondLargestInArray
{

	public static void main(String[] args) 
	{
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	    int firstLargest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	      if (arr[i] > firstLargest) {
	        secondLargest = firstLargest;
	        firstLargest = arr[i];
	      } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
	        secondLargest = arr[i];
	      }
	    }

	    System.out.println("The second largest element in the array is: " + secondLargest);
	  }
	}
	

