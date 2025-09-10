package Arrays;

public class MaxElement {
	
	public static void main(String[] args) {
		
		
		int[] arr = {12,53,11,76,94,333,423,60};
		int max = arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			
			if(arr[i] > max)
			{
				max=arr[i];
			}
			
			
		}
		System.out.println("maximum element:"+ max);
		
	}

}
