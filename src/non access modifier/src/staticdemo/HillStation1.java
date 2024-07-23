package staticdemo;//if class sharing common features static can be used as a best approach//
       class HillStation{
    	   static String climate="cold and rainy";//static variable stored in class loading area//
    	   int temperature;                       //instance variable in heap memory//
           
    	   public static void rain(){
    		   System.out.println("it is raining and too cold");
    	   }
       }

public class HillStation1 {
	public static void main(String[]args){
		HillStation ooty=new HillStation();
		ooty.temperature=16;
		
		HillStation kodaikanal=new HillStation();
		kodaikanal.temperature=17;
		
		HillStation moonar= new HillStation();
		moonar.climate="sunny";//one change in static keyword reflect on others due to common memory location//
		moonar.temperature=24;
		
		System.out.println(ooty.climate+":"+ ooty.temperature);
		System.out.println(kodaikanal.climate+":"+ kodaikanal.temperature);
		System.out.println(moonar.climate+":"+ moonar.temperature);
		
		HillStation.rain();//method can be called directly without using print//
		System.out.println(HillStation.climate);
		
		
		
	}

}
