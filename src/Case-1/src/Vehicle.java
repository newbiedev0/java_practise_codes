import java.io.Serializable;


 class Vehicle implements Serializable {
         private String model;
         private long   price;
		public String getModel() {
			return model;
		}
		public void setModel(String model) {
			this.model = model;
		}
		public long getPrice() {
			return price;
		}
		public void setPrice(long price) {
			this.price = price;
		}
         
}
class Car extends Vehicle{
	
}
