import java.util.Scanner;
public class CheckPrime {
    public static String isPrime(int num) {
		//Your code goes here
		int count=0;
		for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                count+=1;
            }
		}
		
		return (count>0 || num==1)?"NO":"YES";
	}

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n));
        sc.close();
    }
    
}
