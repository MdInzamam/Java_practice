package practice;

public class left_rotate_arrya_by_D {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
		int n = 3;
		left_rotate_array_by_D(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void left_rotate_array_by_D(int arr[], int n) {
		int[] temp = new int[n];
		int len = arr.length;

		for (int i = 0; i < n; i++) {
			temp[i] = arr[i];
		}
		for (int i = n; i < len; i++) {
			arr[i - n] = arr[i];
		}
		for (int i = 0; i < n; i++) {
			arr[len - n + i] = temp[i];
		}
	}
}
