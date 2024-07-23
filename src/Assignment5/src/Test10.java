package Assignment5.src;


//This program is only for creating exception

 class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}
 
 class Calculator {
	    public static int divide(int dividend, int divisor) throws NegativeNumberException {
	        if (divisor < 0) {
	            throw new NegativeNumberException("USE YOUR BRAIN IDIOT.");
	        }
	        return dividend / divisor;
	    }
	}
 public class Test10 {
	    public static void main(String[] args) {
	        try {
	            int result = Calculator.divide(10, -2);
	            System.out.println(result);
	        } catch (NegativeNumberException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}



