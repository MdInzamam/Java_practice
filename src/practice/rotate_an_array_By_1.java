package practice;

public class rotate_an_array_By_1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		rotateArrayBy1(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void rotateArrayBy1(int arr[], int n) {
		int temp = arr[0];
		for (int i = 1; i < n; i++) {
			arr[i - 1] = arr[i];
		}
		arr[n - 1] = temp;
	}
}
