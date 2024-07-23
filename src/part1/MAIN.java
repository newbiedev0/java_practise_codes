package part1;

public class MAIN {
	public class Main{
		public static void main(String[]args){
			try {
				throw new MyException("lol");
			}
			catch (MyException ex){
			   System.out.println("caught");
			   
			   System.out.println((ex.getMessage()));
			}
			
		}
	}

}
