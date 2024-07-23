package Assignment5.src;

public class Test9 {
    public static void main(String[] args) {
        Object[] objects = new String[5];
       try {
        objects[0] =5;
        System.out.println(objects);
    }catch(ArrayStoreException a){
          System.out.println("caught exception");
}
    }
}
       