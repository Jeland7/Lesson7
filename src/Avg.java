
public class Avg {
	//declare instance variables
		private int numbers[];
		private double average;
	
		public Avg() {
			//numbers[] = null
			//average = 0.0
		}
		
		//setter
		public void setNumbers(int[] numbers) {
			this.numbers = numbers;
		}
		
		////compute the average of all the numbers form []
		public void calculateAverage() {
			int sum; //to store the sum of all the elements
			int currentElement; //to store the current element from the array
			
			sum = 0;
			
			for(int i = 0; i < numbers.length; i++) {
				//retrieve the element at index i
				sum = sum + numbers[i]; //update
			}
			//compute
			average = (double)sum/numbers.length;
		}
		
		//getter
		public double getAverage() {
			return average;
		}
		
	}//end class

