import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int x) {
        int duplicate_x = x;
        long rev = 0;
        if (x < 0) {
            return false;
        }
        while (x != 0) {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }
        return (rev == duplicate_x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        sc.close();
    }
}
