import java.util.*;

class arraySum {

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n;
		int sum = 0;	
		
		System.out.println("Enter length of array: ");
		n = scn.nextInt();
		int myArray[];
		myArray= new int[n];
		
		System.out.println("Enter integers: ");
	
		for (int i = 0; i < n ; i++){
			myArray[i] = scn.nextInt();
		}

		for (int i =0; i < n; i++){
			sum = sum + myArray[i];
		}
		
		System.out.println("Sum of array is: " + sum);
	}
}
