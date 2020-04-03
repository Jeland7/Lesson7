
public class AvgMinMax {

	private int numbers[];
	private int max;
	private int min;
	private double average;


	public AvgMinMax() {
	
	}
	
	//setter
	public void setNumbers(int[] numbers) {
	this.numbers = numbers;
	
	}

	public int getMax() {
		return max;
	}

	public int getMin() {
		return min;
	}
	
	public double getAverage() {
		return average;
	}
	
	public void calculation() {
		max = numbers[0];
		min = numbers[0];
		int sum = 0; 
		
		for(int i = 1; i < numbers.length; i++) {
			if(numbers[i]>max) {
				//update the max with current value
				max = numbers[i];
			} 
		} 
		for(int j = 1; j < numbers.length; j++) {	
			if (numbers[j] < min) {
				min = numbers[j];
			}
		}	
		for(int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i]; 
		}
		
		//compute
		average = (double)sum/numbers.length;
		}
	


}//end class
