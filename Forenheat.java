import java.util.Scanner;
class Forenheat
{
  public static void main(String args[])
 { 
    Scanner sc=new Scanner(System.in);
   int f;
   float c;
   System.out.println("enter f value: ");
   f=sc.nextInt();
   c=(32-f)*0.55f;
   System.out.println("the celsius  value is"+c);
   }
}  
   