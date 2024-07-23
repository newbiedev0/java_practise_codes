import java.util.ArrayList;

public class Test1 {
	public static void main(String[]args) {
		ArrayList<String>color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("green");
		color.forEach((c)->{System.out.println(c);});
		color.forEach(System.out::println);
	}
}
		
	

