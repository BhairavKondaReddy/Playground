import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int number, first_digit, last_digit,sum =0;
		Scanner sc = new Scanner(System.in);
        number = sc.nextInt();	
		first_digit = number;
		while(first_digit !=0)
		{
			last_digit = first_digit % 10;
			sum =sum+last_digit;
            first_digit = first_digit / 10;
		}	
        System.out.println(sum);
		
	}
}