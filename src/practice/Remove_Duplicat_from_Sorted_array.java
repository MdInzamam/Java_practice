package practice;

public class Remove_Duplicat_from_Sorted_array {

	public static void main(String[] args) {
		int arr[] = { 1,2, 2, 3, 3, 4, 7 };
		int newsize = RemoveDuplicat(arr);
		for (int i = 0; i < newsize; i++) {
			System.out.print(arr[i]);
		}
	}

	public static int RemoveDuplicat(int arr[]) {

		int temp = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[temp - 1]) {
				arr[temp] = arr[i];
				temp++;
			}
		}
		return temp;
	}
}
