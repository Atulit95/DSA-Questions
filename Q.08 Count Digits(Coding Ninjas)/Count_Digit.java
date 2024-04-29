import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int duplicate_n=n;
        int count=0;
        while (duplicate_n > 0) {
            int divisor = duplicate_n % 10;
            if (divisor!=0 && n % divisor == 0) {
                count = count + 1;
            }
            duplicate_n = duplicate_n / 10;
        }
        System.out.println(count);
        sc.close();
    }
}
