package practice;

public class Max_Differnce {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 9, 8 };
		System.out.println("Maximum Difference: " + maxDifference(arr));
	}

	public static int maxDifference(int arr[]) {
		int min = arr[0];
		int max = 0;
		for (int i = 0; i < arr.length; i++) {

			if (min >= arr[i]) // 1st Part
				min = arr[i];
			else {
				if (max < arr[i] - min) // 2nd Part
					max = arr[i] - min;
				System.out.println(max);
			}
		}
		return max;
	}
//		int min = arr[0];
//		int max = -1;
//		for (int i = 0; i < arr.length; i++) {
//			min = Math.min(min, arr[i]);
//			if (min < arr[i])
//				max = Math.max(max, arr[i] - min);
//
//		}
//		return max;
//	}
}