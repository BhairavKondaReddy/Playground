import java.util.Scanner;
class Main {
	public static void main (String[] args){

      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
     
   for(int num=0;num<=n;num++)
   {
     if(num%2 !=0)
     {
       System.out.println(num);
     }
	}
}
}
