package Algorithms;

public class BinarySearch {
	
	int[] arr = { 9, 11, 32, 34, 43, 46, 56, 58, 63, 68, 75, 97, 104, 119 };
	int target = 75;
	
	boolean found = false;
	int n = arr.length;
	int mid;
	
	
	public void reverse() {
		int start = 0;
		int end = arr.length - 1;
	while (start < end)// REVERSING THE ARRAY INTO DESCENDING ORDER
	{
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;

		start++;
		end--;
	}

	for (int j = 0; j < n; j++) {
		System.out.print(arr[j] + " ");
	}
	}
	
	
	// NOW APPLYING BINARY SEARCH ALGORITHM FOR DESCENDING OREDERED ARRAY
	public int binarySearch()
	{
		int start = 0;
		int end = arr.length - 1;
	while (start <= end) {
		 mid = (start + end) / 2;

		if (arr[mid] == target) {
			System.out.println("\nTARGET FOUND AT INDEX: \n" + mid);
			found = true;
			break; // exit loop once found
		} else if (arr[mid] < target) {
			end = mid - 1; // search right half
		} else {
			start = mid + 1; // search left half
		}
		
	}

	if (!found) {
		System.out.println("ELEMENT NOT FOUND");
	}
	return mid;
}

	public static void main(String[] args) {
		BinarySearch bs=new BinarySearch();
		bs.reverse();
		bs.binarySearch();
		

		

		
	}
}

