import java.util.*;

class findNum{

	public static void main(String[] args) {
		int myArr[];

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int num = scn.nextInt();

		System.out.println("Enter elements: ");
		
		myArr = new int[num];
		for (int i = 0 ; i < num ; i++){
			myArr[i] = scn.nextInt();	
		}
		System.out.println("Your array is: " + Arrays.toString(myArr));
		System.out.println("Enter number whose index you need: ");

		int numToFind = scn.nextInt();
		boolean test = Arrays.asList(myArr).contains(numToFind);
	
		while (test == false) {
				System.out.println("Enter a valid input" );
				numToFind = scn.nextInt();
				break;
			}
		for ( int i = 0; i < num ; i++){
			
		
			if(myArr[i] == numToFind){
				System.out.println(i +" is the index of " + numToFind);
				}
				 
			}
	}
}
