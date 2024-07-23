
public class Test1 {
	 public static void main(String[] args) {
	      int[] numbers = new int[]{100, 987, 809, 56, 768};
	      int largest = Integer.MIN_VALUE;// minimum value is a constant to represent limit of 32 bit integer

	      for (int i = 0; i < 5; i++) {
	         if (numbers[i] > largest) {
	            largest = numbers[i];
	         }
	      }

	      System.out.println("The largest number is: " + largest);
	   }
}
