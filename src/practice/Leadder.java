package practice;

public class Leadder {

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4, 8, 6, 5, 2 };
		Leader(arr);
	}

	public static void Leader(int arr[]) {
		int len = arr.length;
		for (int i = 0; i < len - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println(arr[len - 1]);
	}

}
