import java.util.*;
class findMissing{
	public static void main(String[] args){
		int myArr[] = new int[]{1, 2 , 4 , 5};
		int size = 5;
		System.out.println("Missing number in " + Arrays.toString(myArr) +" is " + findMiss(myArr, size));

	}
	
	private static int findMiss(int[] arr,int size){
		int actualSum = 0;
		int originalSum;
		originalSum = ( size * (size + 1 ) ) / 2;
		for ( int i : arr ) {
			actualSum = actualSum + i;
		}
		return originalSum - actualSum;
	}
}
