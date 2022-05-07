import java.util.Scanner;
class Tri
  {
public static void main(String args[])
  
    {
      Scanner s =new Scanner(System.in);
      
    int l,b,area,cr;
    
    System.out.println(" enter the length of rectangle");

     l= s.nextInt();

System.out.println("enter the width of the rectangle");

     b=s.nextInt();
      area= l*b;
      cr= 2*(l+b);
      
        
System.out.println("area of a reactangle:"+area);
      
System.out.println("circumforence of a rectangle:"+cr);
      }
  }