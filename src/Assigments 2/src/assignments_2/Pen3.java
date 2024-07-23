package assignments_2;


 class Pen{
	
    private String color;
    private String brand;
    private int pointSize;
 
   
    public void setcolor(String color){
    	this.color=color;
    }
    public void setbrand(String brand){
        this.brand=brand;
    }
    public void setpointSize(int pointSize){
    	this.pointSize=pointSize;
    }
    public String getcolor(){
    	return color;
    }
    public String getbrand(){
    	return brand;
    }
    public int getpointSize(){
    	return pointSize;
    }
    public void write(){
    	System.out.println("this pen is writing");
    }
}

public class Pen3 {
     public static void main(String[]args) {
    	 Pen p= new Pen();
 		p.setcolor("blue");
 		p.setbrand("reynolds");
 		p.setpointSize(1);
 		
 		
 		System.out.println(p.getcolor());
 		System.out.println(p.getbrand());
 		System.out.println(p.getpointSize());
 		p.write();
	}

}
