
public class FrequencyOfElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 13, 44, 5, 32, 12, 13, 5, 9 };

		int visistedArr[] = new int[arr.length];

		int visited = -1;
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visistedArr[j] = visited;
				}
			}
			if (visistedArr[i] != visited) {
				visistedArr[i] = count;
			}

		}
			for(int i =0;i<visistedArr.length;i++)
			{
				if(visistedArr[i]!=visited)
{
	System.out.println("Frequency of " + arr[i] + ": " + visistedArr[i]);
}
				{
					
				}
			}
	}

}
