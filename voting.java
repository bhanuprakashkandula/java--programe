import java.util.Scanner;
class voting
  {
    public static void main(String args[])
    { 
Scanner sc = new Scanner(System.in);
      int a;
      System.out.println("enter the person age");
      a=sc.nextInt();
      if(a>=18)
      {
        System.out.println("eligible");
      }
       else
      {
        System.out.println("not eligible");
      }
      }
  }