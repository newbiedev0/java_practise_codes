import java.io.Serializable;

interface Car {
	Tyre getTyre();
}

class TataCar implements Car, Serializable {
	Tyre tyre;

	@Override
	public Tyre getTyre() {
		tyre = new Tyre();
		tyre.setBrand("MRF");
		tyre.setPrice(5000);
		return tyre ;
	}
}

class Tyre {
	private String Brand;
	private long price;

	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	// public String toString(){
	// return "brand:"+Brand+" price:"+price;
	// }
}
