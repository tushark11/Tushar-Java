package Algorithms;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {3,67,98,78,35,85,14,56,38,11,60};
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==11)
			{
				System.out.println("ELEMENT FOUND AT THE INDEX:"+i);
			}
		}
	}

}
