package practice;

public class count_0_and_1 {

	public static void main(String[] args) {
		int arr [] = {1,2,3,1,0,0,1};
		countNoofZeroandOne(arr);
	}
	public static void countNoofZeroandOne(int arr []) {
		int len = arr.length;
		int zero = 0;
		int ones = 0;
		for(int i=0;i<len;i++) {
			if(arr[i] == 0) {				
				zero++;
			}
			
			else if(arr[i] == 1){				
				ones++;
			}
		}
		System.out.println("No Of Zero :-" + zero);
		System.out.println("No Of Ones :-" + ones);
	}

}
