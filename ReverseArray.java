package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60,70};
		
		int start = 0;
		int end=arr.length-1;
		
		while(start<end)
		{
			int  temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
			
		/*for(int i=0;i<arr.length/2;i++)//only works for even elements
		{
			int  temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}*/
		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
