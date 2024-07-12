import java.util.Scanner;

public class sumofAllDivisors {
    static int SumofDivisor(int n){
        int counter=2;
        int sum=1;
        for(int i=counter;i<=Math.sqrt(n);i++){
            if(n%i==0){
                sum=sum+i;
            }
            if(i!=n/i){
                sum=sum+n/i;
            }
        }
        return sum;

    }
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int total_sum=1;
        for (int i=2;i<=n;i++){
            System.out.println(total_sum);
            total_sum=total_sum+SumofDivisor(i);
        }
        return total_sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(SumofDivisor(n));
        sc.close();
    }
    
}