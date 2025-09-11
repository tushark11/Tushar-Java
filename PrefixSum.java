package Arrays;

public class PrefixSum {
	public static void main(String[] args) {
	
		int[] arr = {10,20,30,40,50};
		
		int[] prefixArr = new int[arr.length];
		
		prefixArr[0]=arr[0];
		
		for(int i=0; i<arr.length-1;i++)
		{
			prefixArr[i+1]=arr[i]+arr[i+1];
		}
		
		for(int j=0;j<prefixArr.length;j++)
		{
			System.out.print(prefixArr[j]+" ");
		}
		
		
		
	}
	
}
