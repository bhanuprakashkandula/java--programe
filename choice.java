import java.util.Scanner;
class choice
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c,choice;
System.out.println("CALCULATOR");
System.out.println("[1].ADDITION");
System.out.println("[2].SUBTRACTION");
System.out.println("[3].MULTIPLICATION");
System.out.println("[4].DIVISION");
System.out.println("[5].REMAINDER");

 System.out.println("Enter Your Choice:");
choice=sc.nextInt();

 System.out.println("Enter a,b values:");
a=sc.nextInt();
b=sc.nextInt();

 switch(choice)
{
case 1:
c=a+b;
        System.out.println("The Addition value is:"+c);
break;
case 2:
c=a-b;
         System.out.println("The Subtraction value is:"+c);
break;
  case 3:
c=(a)*(b);
         System.out.println("The multiplycation value is:"+c);  
    break;
  case 4:
c=a/b;
        System.out.println("The division value is:"+c);
    break;
  case 5:
    c=(a)%(b);
       System.out.println("The remainder value is:"+c);
    break;
 default:
System.out.println("WRONG CHOICE");
}
}
}