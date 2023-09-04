package practice;

public class Find_second_largest_number {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 6, 5, 7, 4 };
		secondLargestNo(arr);
	}

	public static void secondLargestNo(int arr[]) {
		int len = arr.length;
		int temp = -1;
		int largest = 0;

		for (int i = 1; i < len; i++) {
			if (arr[largest] < arr[i]) {
				temp = largest;
				largest = i;
				System.out.println(larg);
			}
		}
	}
}
