import java.util.Scanner;
class Weekday
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("enter n value");
    n=sc.nextInt();
    switch(n%2)
    {
     case 0:
     System.out.println("sunday");
     break;
     case 1:
     System.out.println("monday");
     break;
     case 2:
     System.out.println("tuesday");  
     break;
     case 3:
     System.out.println("wednesday"); 
     break;  
     case 4:
     System.out.println("thursday");
     break;   
     case 5:
     System.out.println("friday");
     break;
     case 6:
     System.out.println("saturday");
     break;
      default:
    }               
  }
}