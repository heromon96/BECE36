package libs;

public class Mainclass
{
	public static void main(String[] args) 
	{
      System.out.println("Program starts...");
      
      Object obj = new Object();
      Object obj2 = new Object();
      Object obj3 = obj;

      
      int h1 = obj.hashCode();
      System.out.println("h1 = "+h1);
      
      int h2 = obj2.hashCode();
      System.out.println("h2 = "+h2);
      
      String str = obj.toString();
      System.out.println(str);
      
      String str2 = obj2.toString();
      System.out.println(str2);
      
      boolean b1 = obj.equals(obj2);
      System.out.println("b1 : "+b1);
      
      boolean b2 = obj.equals(obj3);
      System.out.println("b2 : "+b2);
      
      System.out.println(obj.toString());
      System.out.println(obj);
      
      System.out.println("Program ends...");
	}
}




