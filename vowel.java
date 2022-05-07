import java.util.Scanner;
class vowel
  {
    public static void main(String args[])
    {
    Scanner sc =new Scanner(System.in);
       char ch;
      System.out.println("charecter ");
      ch=sc.next().charAt(0);
      if(ch=='a')
      { 
        System.out.println("vowel");
          }
      if(ch=='e')
      {
        System.out.println("vowel");
      }
      if(ch=='i')
      {
        System.out.println("vowel");
      }
     if(ch=='o')   
     { 
       System.out.println("vowel");
       }
      if(ch=='u')
      {
        System.out.println("vowel");
      }
      else
      { 
        System.out.println("Consonants");
      }
  }
}
