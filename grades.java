 import java.util.Scanner;
class grades
{
public static void main(String args[])
{
int sno,m1,m2,m3,tot;
String sname;
float savg;
Scanner sc=new Scanner(System.in);

 System.out.println("Enter Student Number");
sno=sc.nextInt();
System.out.println("Enter Student Name:");
sname=sc.next();
System.out.println("Enter Student Marks:");
  System.out.println("Enter m1 Marks:");
m1=sc.nextInt();
  System.out.println("Enter m2 marks:");
m2=sc.nextInt();
  System.out.println("Enter m3 Marks:");
m3=sc.nextInt();

 tot=m1+m2+m3;
savg=tot/3;
System.out.println("STUDENT DETAILS");
System.out.println("The Student Number is:"+sno);
System.out.println("The Student Name is:"+sname);
System.out.println("The Student Marks");
System.out.println("Maths:"+m1);
System.out.println("Physics:"+m2);
System.out.println("Chemistry:"+m3);
System.out.println("The Student Total is:"+tot);
System.out.println("The Student Average is:"+savg);
if(m1>=35 && m2>=35 && m3>=35)
{
System.out.println("RESULT : PASS");
if(savg<50)
System.out.println("GRADE : C");
else if(savg>=51 && savg<=70)
System.out.println("GRADE : B");
else if(savg>=71 && savg<=80)
System.out.println("GRADE : A");
else
System.out.println("Student Pass in Distension");
}
else
{
System.out.println("RESULT : FAIL");
}
}
}
      
      
  