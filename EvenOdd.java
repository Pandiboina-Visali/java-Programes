import java.util.Scanner;
class EvenOdd
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
    System.out.println("it value is Even Number");
    break;
    case 1:
    System.out.println("it value is 0dd Number");
    break;
    default:
    }
  }
}
  //enetr the number even or odd using switch case           
          