package problemsonarrays;

import java.util.Scanner;

public class SecondSmallestElementInArray {
	public static void sSmallest(int arr[], int n) {
//		int smallest = arr[0];
		int smallest = Integer.MAX_VALUE;
		int ssmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] == smallest) {
				ssmallest = smallest;
			} else if (arr[i] < smallest) {
				ssmallest = smallest;
				smallest = arr[i];

			} else if (arr[i] < ssmallest) {
				ssmallest = arr[i];
			}
		}
		System.out.println(ssmallest);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of an array :");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the values of :" + n);
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();

		}
		sSmallest(arr, n);
	}

}
