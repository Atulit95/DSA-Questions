import java.util.Scanner;

public class check_Armstrong {

	public static int count_digit(int n){
		int count=0;
		while(n!=0){
			count+=1;
			n/=10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int duplicate=n;
		int sum=0;
		int pow=count_digit(duplicate);
		while(duplicate!=0){
			int digit= duplicate%10;
			sum=sum+(int)Math.pow(digit,pow);
			duplicate/=10;
		}
		if(n==sum)
			System.out.println(true);
		else
			System.out.println(false);
		sc.close();

	}
}