import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n =in.nextInt();
    int d1=n%10;
    n=n/10;
    int d2=n%10;
    n=n/10;
    int r =(d1*100)+(d2*10)+n;
    System.out.println(r);
  }
}