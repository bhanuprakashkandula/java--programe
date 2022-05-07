import java.util.Scanner;
class Celsius
  {
    public static void main(String args[])
    { 
    Scanner sc=new Scanner(System.in);
      int n;
     float c;
    
      System.out.println("enter the n heat value");
      n=sc.nextInt();
      
       c=(32-n)*0.55F;
      System.out.println("temp in celsius:"+c); 
        c= sc.nextFloat();
      
    }
  }  
    
  