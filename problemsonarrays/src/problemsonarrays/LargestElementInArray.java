package problemsonarrays;

import java.util.Scanner;

public class LargestElementInArray {

	public static int largestArray(int arr[], int n) {
		int larg = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] > larg) {
				larg = arr[i];
			}
		}

		return larg;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of n" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		System.out.println(largestArray(arr, n));

	}

}
