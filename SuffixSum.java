package Arrays;

public class SuffixSum {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int n = arr.length;
		int[] suffixArr = new int[n];

		suffixArr[n - 1] = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			suffixArr[i] = arr[i] + suffixArr[i + 1];
		}

		for (int j = 0; j < n; j++) {
			System.out.print(suffixArr[j] + " ");
		}

	}
}