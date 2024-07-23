package part1;

public class OwnLoop {
    public static void main(String[]args) {
    int[] num = new int[]{24,89,78,20};
    	int peak = num[0];
    	
    	
    	for(int i=1;i<num.length;i++) {
    		if(num[i]>peak) {
    			peak=num[i];
    		}
    	}
    	System.out.println("peak num is: "+ peak);
    	
    	
    	 int[] numbers = new int[]{ 5, 10, 15, 20, 25 };
         int sum = 0;

         for (int i = 0; i < numbers.length; i++) {
             sum += numbers[i];
         }

         double average = (double) sum / numbers.length;

         System.out.println("The average number is: " + average);
     }
    }
  
	

