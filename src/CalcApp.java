import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		int numbers[];
		
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the size of array: ");
		
		int size = input.nextInt();
		numbers = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.println("Enter value " + (i+1));
			numbers[i] = input.nextInt();
		}
		
		
		//processing
		AvgMinMax amm = new AvgMinMax ();
		amm.setNumbers(numbers);
		amm.calculation();
		
		//output
		int max = amm.getMax();
		int min = amm.getMin();
		double avg = amm.getAverage();
		
		System.out.println("Max is: " + max);
		System.out.println("Min is: " + min);
		System.out.println("Average is: " + avg);
		
		
	}//end main
}//end class
