interface FuncInterface
{
   void multiply(int x);
  
  public default void statement()
    {
       System.out.println("Hello");
    }
}
  
public class Test2
{
    public static void main(String args[])
    {
        FuncInterface fobj = (int x)->System.out.println(2*x);  
        fobj.multiply(5);
        fobj.statement();
    }
}