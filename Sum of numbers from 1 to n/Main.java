import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
      int sum =0 ;
 for(int num=1;num<=n;num++)
      {
        int a=num;
        
        sum = sum+a;
       }
      System.out.println(sum);
	}
}