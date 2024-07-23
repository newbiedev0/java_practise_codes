
public class Test7 {

	
	public static void main(String[] args) {
		int[] numbers = {11, 22, 33, 67, 90, 77, 53, 98, 23, 3};
	    int sum = 0;
	    for (int i = 0; i <10 ; i++) {
	      if (numbers[i] % 2 != 0) {
	        sum += numbers[i];
	      }
	    }
	    System.out.println("The sum of odd numbers in the array is: " + sum);
	  
	}

}
