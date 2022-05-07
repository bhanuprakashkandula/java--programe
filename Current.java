import java.util.Scanner;
class Current
  {
    public static void main (String args[])
    {
      Scanner cb=new Scanner(System.in);
      int cno,pmr,lmr,tu;
      float cbill;
      String cname;
      System.out.println("enter customer number=");
      cno=cb.nextInt();
      System.out.println("enter customer name=");
      cname=cb.next();
      System.out.println("enter present month reading=");
      pmr=cb.nextInt();
      System.out.println("enter last month reading=");
      lmr=cb.nextInt();
      tu=pmr-lmr;
       
      System.out.println("customer number is:"+cno);
      System.out.println("customer name is:"+cname);
      System.out.println("present month reading is:"+pmr);
      System.out.println("last month reading:"+lmr);
      System.out.println("total units ="+tu);
       
      if(tu<=50)
    cbill=(tu*1.45f);
      else if(tu<=100)
    cbill=(50*1.45f)+(tu-50)*(2.38f);
      else if (tu<=200)
    cbill=(50*1.45f)+(50*2.38f)+(tu-100)*(4.5f);
     else if(tu<=300) 
    cbill=((50*1.45f)+(50*2.38f)+(100*4.5f)+(tu-200)*5.5f);
      else if(tu<=400)
    cbill=((50*1.45f)+(50*2.38f)+(100*4.5f)+(200*5.5f)+(tu-300*(5.5f);
      else
 cbill=((50*1.45f)+(50*2.38f)+(100*4.5f)+(200*5.5f)+300*5.5f+(tu-400)*(6.5f)); 
      { 
       System.out.println("total current bill="+cbill);     
        }
    }
  }