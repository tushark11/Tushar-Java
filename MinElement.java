package Arrays;

public class MinElement {
	
	public static void main(String[] args) {
		
		int [] arr = {10,5,67,83,9,11,28};
		
		int min = arr[0];
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			
		}
		System.out.println(min);
		
		
		
	}

}
