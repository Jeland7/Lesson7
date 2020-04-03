
public class AvgMin {

	//declare instance variables
	private int numbers[];
	private int min;
	
	public AvgMin() {
		
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int getMin() {
		return min;
	}
	
	public void calculateMin() {
		//initialise the min with the first element of the []
		min = numbers[0];
		
		//traverse the [] from the second element since we stored the 1st one in the variable mi
		for(int i = 1; i < numbers.length; i++) {
			
			//if the current element located in the array numbers at index i is lower
			//than the value stored in the min than update the min with current element
			if (numbers[i] < min) {
			min = numbers[i];//update
			}
		}
		}
		
	
	}//end class
		
	
