import java.util.*;

class reverseArr{

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter size of Array: ");
		int size = scn.nextInt();
			
		System.out.println("Enter " + size + " elements: ");
		int myArr[];
		myArr = new int[size];

		for (int i = 0; i < size ; i++){
			myArr[i] = scn.nextInt();
		}

		System.out.println("Your entered Array is: " + Arrays.toString(myArr));

		
		doReverse(myArr, size);	
			

	}

	private static int doReverse(int[] arr, int size){
		int temp;
		for (int i = 0 ; i < size/2 ; i++ ){
			temp = arr[i];
			arr[i] = arr[size - 1 - i ];
			arr[size - 1 - i] = temp;
		}

		System.out.println("Reversed array is : " + Arrays.toString(arr));
	
		return 1;
	}


}
