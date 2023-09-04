package practice;

public class Revarse_Array {

	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 4, 5, 7 };
		int n = arr.length;
		revarseArray(arr, n);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void  revarseArray(int arr[], int n) {
		int low = 0;
		int heigh = n - 1;
		while (low < heigh) {
			int temp = arr[low];
			arr[low] = arr[heigh];
			arr[heigh] = temp;
			
			low++;
			heigh--;
		}
		
	}
}
