import java.util.*;

class count {
	
	public static int countMostFrequent(int[] arr, int size){
		
		int maxcount = 0;
		int mostFrequent = 0;
		for (int i = 0; i < size ; i++){
			int count = 0;
			for (int j = 0; j < size; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if ( count > maxcount ) {
				maxcount = count;
				mostFrequent = arr[i];
			}			
				
		}
		return mostFrequent;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scn.nextInt();
		
		int myArray[];
		myArray = new int[size];

		System.out.println("Enter " + size + " numbers");
		for (int i = 0; i < size ; i ++){
			myArray[i] = scn.nextInt();
		}

		System.out.println("The most frequent number is : " + countMostFrequent(myArray, size));
	}
}
