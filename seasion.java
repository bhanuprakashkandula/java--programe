 import java.util.Scanner;
class seasion
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int month;
      System.out.println("enter month number :");
      month=sc.nextInt();
      switch(month)
        {
          case 3:
          case 4:
          case 5:
          case 6:
            System.out.println("this is summer season");
                   break;
          case 7:
          case 8:
          case 9:
          case 10:  
            System.out.println("this is rainy season");
                    break;
          case 11:
          case 12:
          case 1:
          case 2:  
            System.out.println("this is winter season");
                    break;
          default: System.out.println("wrong choice");  
        }
    }
  }