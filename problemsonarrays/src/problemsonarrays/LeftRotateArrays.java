package problemsonarrays;

import java.util.Scanner;
// Program to left rotate the element of an array by one Place .
public class LeftRotateArrays {
	
//	Method to left rotate the the array by One place
	public static void leftRotateArray(int arr[], int n) {
		int temp = arr[0];
		for (int i = 0; i < n -1; i++) {
			arr[i] = arr[i + 1];

		}
		arr[n - 1] = temp;
//		return arr[n];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of an array:" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		leftRotateArray(arr, n); // Method Calling and printing 
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
