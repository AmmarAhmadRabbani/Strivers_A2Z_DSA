package problemsonarrays;

import java.util.Scanner;

public class RemoveDuplicatedFromArray {

	public static int removeDuplicate(int arr[], int n) {
		int i = 0;
		for (int j = 1; j < n; j++) {
			if (arr[i] != arr[j]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of:" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		int removeDuplicate = removeDuplicate(arr, n);
		System.out.println(removeDuplicate);
	}

}
