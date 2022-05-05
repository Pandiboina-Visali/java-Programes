import java.util.Scanner;
class Currentbill
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int cno,pmr,lmr,tu;
      String cname;
      float cbill;
      System.out.println("entercoustmer number:");
      cno=sc.nextInt();
      System.out.println("entercoustmer name:");
      cname=sc.next();
      System.out.println("enter the present month reading:");
      pmr=sc.nextInt();
      System.out.println("enter the last month reading:");
      lmr=sc.nextInt();
      tu=pmr-lmr;
      cbill=tu*3.40f;
      System.out.println("entercoustmer number:"+cno);
      System.out.println("entercoustmer name:"+cname);
      System.out.println("enter the present month reading:"+pmr);
      System.out.println("enter the last month reading:"+lmr);
      System.out.println("total units:"+tu);
      System.out.println("Currentbill:"+cbill);
      
    }
  }  
    
      
      