import java.util.Scanner;
class temparary
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
    int a,b;
      System.out.println("enter the a value");
      a=sc.nextInt();
      System.out.println("enter the b value");
      b=sc.nextInt();
    a=(a+b);
    b=(a-b);
    a=(a-b);
      System.out.println(" the value of a is:"+a);
       System.out.println(" the value of b is:"+b);
        
    }
     
  }