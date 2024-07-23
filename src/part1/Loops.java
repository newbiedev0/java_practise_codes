package part1;

class Loops {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 40, 30, 50};
        int max = numbers[0]; // initialize the max variable with the first element of the array
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // update the max variable if the current element is greater
            }
        }
        
        System.out.println("The largest number in the array is: " + max);
        
        int[] values= {2,5,9,8,7};
        int high = values[0];
        
        for(int i=1;i<values.length;i++) {
        	if(values[i]>high) {
        	high=values[i];
        	}
        }
        System.out.println ("the largest value is: "+ high);        
    }
        
        
    
}


    		 
