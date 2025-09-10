package Arrays;

public class SwappingArrayElements {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		
		
		int start = 0;
		int end = arr.length-1;
		
		
		for(int i=0;i<arr.length;i++)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
		}
		
		for(int j=0;j<arr.length;j++)//printing array before swapping
		{
			System.out.print(arr[j]+" ");
		}
		
		

	}

}
