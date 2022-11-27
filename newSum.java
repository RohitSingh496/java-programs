import java.util.*;

class newSum{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int number;
		int myArray[];
		
		System.out.println("Enter number: ");
		number = scn.nextInt();
		
		System.out.println("Enter array: ");
		myArray = new int[number];
		for (int i = 0; i < number; i++){
			myArray[i] = scn.nextInt();
		}
		int result = doSum(number, myArray);

		System.out.println("Output is: " + result);	
	}
	private static int doSum(int number,int[] myArray){
	
		int sum = 0;
		for(int i = 0; i < number; i++){
			sum = sum + myArray[i];	
		}
		return sum;
	}
}
