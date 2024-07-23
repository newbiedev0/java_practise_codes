
public class Test3 {

	
	public static void main(String[] args) {
		int[] numbers = {101, 23, 36, 98, 58};
	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;
	    
	    for (int number :numbers) {
	      if (number > largest) {
	        secondLargest = largest;
	        largest = number;
	      } else if (number > secondLargest) {
	        secondLargest = number;
	      }
	    }
	    
	    System.out.println("Second largest number is: " + secondLargest);
	}

}
