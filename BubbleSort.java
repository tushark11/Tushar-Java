package Algorithms;

public class BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 15, 5, 7, 1, 6, 8, 11, 18, 4, 2 };

		int n = arr.length;

		for (int i = 0; i < n-1 ; i++) {

			for (int j = 0; j < n -i- 1; j++) {
				

				 if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

				

			}
			
		}
		for (int i = 0; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
