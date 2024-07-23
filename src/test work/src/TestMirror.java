
public class TestMirror{
	
	
	public static void main(String[] args) {
		Mirror mir=new Mirror();
		mir.setType("concavemirror");
		mir.setFocalLength("25cm");
		mir.setAperture("5cm");
	    
		mir.focus();
		System.out.println(mir.getType());
		System.out.println(mir.getFocalLength());
	    System.out.println(mir.getAperture());
	    
	}
		
		
		


}
