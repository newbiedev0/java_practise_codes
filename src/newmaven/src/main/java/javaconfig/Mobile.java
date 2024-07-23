package javaconfig;

public class Mobile {
     private Game game;
     private String brand;
    public Mobile(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Mobile() {
    	
    }

	public Mobile(Game game) {
		super();
		this.game = game;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

     
     
}
