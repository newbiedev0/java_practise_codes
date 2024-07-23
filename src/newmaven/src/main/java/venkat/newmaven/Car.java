package venkat.newmaven;

public class Car {
     private String Model;

public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

public Car(){
}

public Car(String model) {
	this.Model=model;
}
public void move() {
	System.out.println("moving");
}
}