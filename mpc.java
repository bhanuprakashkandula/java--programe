import java.util.Scanner;
class mpc
  {
    public static void main(String args[])
    { 
    Scanner sc =new Scanner(System.in);
      int sno,total,avg,math,physi,chem;
      String sname;
      System.out.println("student serial number");
      sno = sc.nextInt();
      System.out.println("name of the student");
      sname = sc.next();
      System.out.println("math marks");
      math = sc.nextInt();
      System.out.println("phys marks");
      physi = sc.nextInt();
      System.out.println("chem marks");
      chem = sc.nextInt();
      total=(math+physi+chem);
      System.out.println("total marks:"+total);
      avg =(math+physi+chem)/3;
    System.out.println("average marks:"+avg);
      System.out.println("math marks:"+math);
      System.out.println("phys marks:"+physi);
      System.out.println("chem marks:"+chem);
       math=sc.nextInt();
      if(math>=35 && physi>=35 && chem>=35)
      {
          System.out.println("pass");
        if(avg<50)
      System.out.println("grade:C");
        else if(avg>=50 && avg<=70)
       System.out.println("grade:B");
        else if(avg>=71 && avg<=80)
      System.out.println("grade:A");
      else
      System.out.println("distension");        
        }
      else
      { 
        System.out.println("fail");
      }
  }
}