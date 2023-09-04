package practice;

public class Max_Consecutive_no {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 1, 1 };
		max_Consecutive_no(arr);
	}

	public static void max_Consecutive_no(int arr[]) {
		int len = arr.length;
		int count = 1, max = 1;

		for (int i = 1; i < len; i++) {
			if (arr[i] == arr[i - 1]) {
				count++;

			} else {
				count = 1;
			}

			if (count > max) {
				max = count;
			}
		}
		System.out.println(max);
	}

}
