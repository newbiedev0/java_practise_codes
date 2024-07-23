
public class Test2 {

	
	public static void main(String[] args) {
		 int[] numbers = {100, -22, 34, 55, 30};
	        int smallest = Integer.MAX_VALUE;
	        for (int i = 0; i < 5; i++) {
	            if (numbers[i] < smallest) {
	                smallest = numbers[i];
	            }
	        }
	        System.out.println("The smallest number in the array is: " + smallest);
	}

}
