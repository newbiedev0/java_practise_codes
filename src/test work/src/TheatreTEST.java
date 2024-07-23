
public class TheatreTEST {

	public static void main(String[] args) {
		Theatre t1= new Theatre();
		t1.setName("DNC theatre");
		t1.setSeatAvailable(25);
		t1.setTotalSeat(100);
		
		t1.MoviePlayed();
		System.out.println(t1.getName());
		System.out.println(t1.getSeatAvailable());
		System.out.println(t1.getTotalSeat());
		
	}

}
