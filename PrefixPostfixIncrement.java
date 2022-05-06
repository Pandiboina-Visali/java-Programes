import java.util.Scanner;
class PrefixPostfixIncrement
  {
    public static void main(String args[])
    {
      int a=10,b;
      System.out.println("Prefic Increment");
      b=++a;
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("Postfix Increment");
      b=a++;
      System.out.println("a="+a);
      System.out.println("b="+b);
      }
  }
  