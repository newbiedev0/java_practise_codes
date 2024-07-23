
public class Theatre {
	private String name;
	private int seatAvailable;
	private int totalSeat;
	
	public void setName(String name){
		this.name=name;
	}
	public void setSeatAvailable(int seatAvailable){
		this.seatAvailable=seatAvailable;
	}
	public void setTotalSeat(int totalSeat){
		this.totalSeat=totalSeat;
	}
	public String getName(){
		return name;
	}
	public int getSeatAvailable(){
		return seatAvailable;
	}
	public int getTotalSeat(){
		return totalSeat;
	}
	public void MoviePlayed(){
		System.out.println("movie is playing");
	}
}
