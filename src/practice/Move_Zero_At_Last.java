package practice;

public class Move_Zero_At_Last {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 0, 3, 7 };
		MoveZeroAtLast(arr);
		for (int i = 1; i < arr.length; i++) 
			System.out.print(arr[i]);	
	
	}

	public static int MoveZeroAtLast(int arr[]) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[x];		
				arr[x] = arr[i];
				arr[i] = temp;
				x++;

			}
		}
		return x;
	}

}
