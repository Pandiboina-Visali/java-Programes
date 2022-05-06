import java.util.Scanner;
class PrefixPostfixDecrement
  {
    public static void main(String args[])
    {
      int a=10,b;
      System.out.println("Prefic Decrement");
      b=a--;
      System.out.println("a="+a);
      System.out.println("b="+b);
      System.out.println("Postfix Decrement");
      b=--a;
      System.out.println("a="+a);
      System.out.println("b="+b);
      }
  }
  