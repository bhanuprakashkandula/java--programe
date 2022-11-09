 import java.util.*;
class Assignment
  {
    public int maxsavings(int Sal[],int Exp[])
    {
      int sav[]=new int[2];
      for(int i=0;i<sav.length;i++)
        {
          sav[i]=Sal[i]-Exp[i];
        }
      int maxSav=sav[0];
      for(int i=0;i<sav.length;i++)
        {
          if(maxSav<sav[i])
          {
            maxSav=sav[i];
          }
        }
      return maxSav;
    }
    public static void main(String[]args)
    {
      Scanner sc=new Scanner(System.in);
         System.out.println(maxSav);
        int Sal[]=new int[3];
        System.out.println("Enetr the Sal elements");
        for(int i=0;i<3;i++)
          {
            Sal[i]=sc.nextInt();
          }
        int Exp[]=new int[3];
        System.out.println("Enetr the Expe elements");
        for(int i=0;i<3;i++)
          {
            Exp[i]=sc.nextInt();
          }
        Assignment obj=new Assignment();
        obj.maxsavings(Sal,Exp); 
   
    }
  }