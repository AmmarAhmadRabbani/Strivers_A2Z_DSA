package problemsonarrays;

import java.util.Scanner;

public class SecondLargestElementInArray {
	public static void secondLargest(int[] arr, int n) {
		int larg = arr[0];
//		This one is also correct
//		int sLarg = -1;
		int sLarg = larg - 1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > larg) {
				sLarg = larg;
				larg = arr[i];

			} else if (arr[i] < larg && arr[i] > sLarg) {
				sLarg = arr[i];
			}
		}
		System.out.println(sLarg);
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
		secondLargest(arr, n);

	}

}
