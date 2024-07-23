package math;

public class math {
    int getValue(int a, int b){
        return 80*a*b;
    }
    int getValue(int a,int b,int c){
    	return 80*a*b*c;
    }
    
	public static void main(String[] args) {
		math m=new math();
		System.out.println("the multiply of two numbers is:"+m.getValue(6,7));
		System.out.println("the multiply of three numbers is: "+m.getValue(7,8,9));
		
	}

}
