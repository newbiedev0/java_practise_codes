package different;
class WaterResource{
	public void fill(){
		System.out.println("water resource is filled");
	}
	public void empty(){
		System.out.println("water resource is empty");
	}
}
class River extends WaterResource{
	public void fill(){
		System.out.println("river is filled");
	}
}
class Lake extends WaterResource{
	
}

public class ResourceTest {

	public static void main(String[] args) {
	     River ri=new River();
	     ri.fill();
	     ri.empty();
	     
	     Lake la=new Lake();
	     la.fill();
	     la.empty();
	     
	     
	}

}
