import java.util.*;
class biggestInArray{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		int myArr[] = new int[5];
		for(int i = 0; i < 5 ; i++){
			myArr[i] = scn.nextInt();
		}
		
		findBig(myArr);
	}

	private static int findBig(int[] arr){
		int biggestNum= Integer.MIN_VALUE ;
		int smallestNum= Integer.MAX_VALUE;

		for ( int i : arr ) {
			if (i > biggestNum ) 
				biggestNum = i;
			else if (i < smallestNum)
				smallestNum = i;
		}
		
		System.out.println("Array is " + Arrays.toString(arr));
		System.out.println("biggest is " + biggestNum);
		System.out.println("smallest is " + smallestNum);
		return 1;
//	Arrays.sort(arr);
//		return arr[size - 1];
		
	}
}
