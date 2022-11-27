import java.util.*;

class k_largest{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		int size = scn.nextInt();
		
		System.out.println("Enter elements: ");
		int myArr[];
		myArr = new int[size];

		for (int i=0; i<size; i++){
			myArr[i] = scn.nextInt();
		}

		System.out.println("Original array is: "+ Arrays.toString(myArr));

		System.out.println("Enter k :");
		int k = scn.nextInt();

		System.out.println("the "+ k +"th largest is " + findKLargest(myArr,size,k));		     System.out.println("the "+ k +"th smallest is " + findKSmallest(myArr,size,k)); 
	}
	
	public static int[] doSort(int[] arr, int size){

		int temp; 
		for (int i = 0; i < size ; i++){
			for(int j = 0; j < size -1; j++){
				if(arr[j] >= arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		return arr;
	}

	private static int findKLargest(int[] arr, int size,int k){
		int arr1[] = doSort(arr,size);
		System.out.println("sorted array: "+ Arrays.toString(arr1));
		return arr1[size - k];
	}

	private static int findKSmallest(int[] arr, int size,int k){
		int arr1[]=doSort(arr,size);
		return arr1[k - 1];
	}
}
