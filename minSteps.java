import java.util.*;

class minSteps{
	public static int minStep(int x, int y){
		int count = 0;
		while ( (x > 1) || (y > 1)){
			if (y > x) {
				y -= x;
			}
			else if (x > y) {
				x -= y;
			}
			else
				return -1;
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter coordinate x : ");
		int x,y;
		int result;
		x = scn.nextInt();

		System.out.println("Enter coordinate y : ");
		y = scn.nextInt();
		
		result = minStep(x,y);
		
		System.out.println("The minimum number of steps to reach " + x +" and " + y +" is : " + result);
		
	}
}
