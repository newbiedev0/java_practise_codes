
public class Test6 {

	
	public static void main(String[] args) {
		int[] numbers = {2,2,4,4,9,5,6,8,10,10};
	      int sum = 0;
	      for(int i=0; i<10; i++) {
	         if(numbers[i]%2 == 0) {
	            sum += numbers[i];
	         }
	      }
	      System.out.println("The sum of even numbers in the array is: " + sum);

	}

}
