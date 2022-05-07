cd Newtojavaimport java.util.Scanner;
  class Cost  
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      int pnu;
      float pc,pq,bill;
      String pna;
      
        System.out.println("enter the product n.o");
      pnu=s.nextInt();
      System.out.println("enter the product cost");
      pc=s.nextFloat(); 
       System.out.println("enter the product pro quantity");
      pq=s.nextFloat(); 
       System.out.println("enter the product pro name");
      pna=s.next(); 
      bill= pc*pq;
      System.out.println("enter the product cost"+bill);
       
    }
  }
    