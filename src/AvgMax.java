
public class AvgMax {
//declare instance variables
	private int numbers[];
	private int max;
	
	public AvgMax() {
		//numbers[] = null
		//max = 0
	}
	
	//setter
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public int computeMax() {
		max = numbers[0];
		for(int i = 1; i < numbers.length; i++) {
			//if the current element of [] located at i > than the value stored in max
			//update  max with current element
			if(numbers[i]>max) {
				//update the max with current value
				max = numbers[i];
			}
		}
		
		return max;
	}
	//getter

	public int getMax() {
		return max;
	}
	
}//end class
