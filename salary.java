 import java.util.Scanner;
class salary
{
  public static void main(String args[])
  { 
  int empno;
  String empname;
  double DA,HRA,PF,IT,TA,Gsal,NSAL,esal;
  Scanner sc= new Scanner(System.in);
  
  System.out.println("enter empno");
empno=sc.nextInt();
   System.out.println("enter EMPNAME ");
  empname=sc.next();
System.out.println("enter esal");
esal=sc.nextInt();
DA=(0.2)*(esal);
  System.out.println("enter DA:"+DA);
   
HRA=(0.1)*(esal);
System.out.println("enter HRA:"+HRA);
 
PF=(0.08)*(esal);
 System.out.println("enter PF:"+PF);
 
IT=(0.05)*(esal);
 System.out.println("enter IT:"+IT);
 
TA=(0.12)*(esal);
 System.out.println("enter TA");
 ;
Gsal=(esal+HRA+DA+TA);
 System.out.println("enter GROSS SAL:"+Gsal);
 
NSAL=Gsal-(PF+IT);
System.out.println("enter GROSS NSAL:"+NSAL);
 
}
}