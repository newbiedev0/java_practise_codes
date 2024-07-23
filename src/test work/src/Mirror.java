
public class Mirror {
	private String type;
	private String focalLength;
	private String aperture;
	
	public void setType(String type){
	    this.type=type;
	}
	public void setFocalLength(String focalLength){
		this.focalLength=focalLength;
	}
	public void setAperture( String aperture){
		this.aperture=aperture;
	}
	public String getType(){
		return type;
	}
	public String getFocalLength(){
		return focalLength;
	}
	public String getAperture(){
		return aperture;
	}
	public void focus(){
		System.out.println("mirror is focusing");
	}
	
	

}
