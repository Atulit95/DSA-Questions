import java.util.Scanner;

public class GCD {
static int gcd(int a, int b){
    if(b==0){
        return a;
    }
    return gcd(b,a%b);
}

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        
        System.out.println(gcd(n,m));
        sc.close();
    }

}
