package problemsonarrays;

import java.util.Scanner;

public class IsArraySorted {
	public static boolean isSorted(int arr[], int n) {
		for (int i = 1; i < n; i++) {
			if (arr[i] >= arr[i - 1]) {

			} else {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the value of an array:" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		boolean sorted = isSorted(arr, n);
		System.out.println(sorted);
	}

}
