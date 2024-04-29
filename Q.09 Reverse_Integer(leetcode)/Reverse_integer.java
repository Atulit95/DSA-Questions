import java.util.Scanner;

public class Reverse_integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long reverse_digit = 0;
        while (n != 0) {
            reverse_digit = reverse_digit * 10 + (n % 10);
            n /= 10;
        }
        if (reverse_digit > Integer.MAX_VALUE || reverse_digit < Integer.MIN_VALUE) {
            System.out.println(0);
        }
        else
            System.out.println(reverse_digit);
        sc.close();
    }
}
