
public class Test9 {

	
	public static void main(String[] args) {
		int[] numbers = {32,1,14,14,16,18,9,3,10,3};
	    int sum = 0;
	    int count = 0;
	    for (int i = 0; i < numbers.length; i++) {
	      if (numbers[i] % 2 != 0) {
	        sum += numbers[i];
	        count++;
	      }
	    }
	    int average = sum / count;
	    System.out.println("The average of even numbers is: " + average);


	}

}
