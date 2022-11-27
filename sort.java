import java.util.*;

class sort{
	
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter size of array: ");
	int size = scn.nextInt();
	
	System.out.println("Enter elements: ");
	int myArr[];
	myArr = new int[size];

	for (int i=0; i < size; i++){
		myArr[i] = scn.nextInt();
	}
	
	System.out.println("Original array is: " + Arrays.toString(myArr));

	doSort(myArr,size);
				

	}

	private static int doSort(int[] arr, int size){
		int temp;
		for (int i = 0; i < size; i++){
				
			for (int j=0; j < size-1; j++){
				
				if(arr[j] > arr[j + 1] || arr[j] == arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}

		}
		System.out.println("Sorted array is: " + Arrays.toString(arr));
		return 1;
	}

}
