
public class Test5 {

	public static void main(String[] args) {
		 int[] numbers = {50, 20, 70, 40, 50, 60, 60, 90, 70, 20};
	        int sum = 0;
	        for (int i = 0; i < 10; i++) {
	            sum += numbers[i];
	        }
	        double average = (double) sum / 10;
	        System.out.println("The average of the numbers in the array is: " + average);

	}

}
