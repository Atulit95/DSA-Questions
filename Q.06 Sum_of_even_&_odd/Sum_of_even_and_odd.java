import java.util.*;

public class Sum_of_even_and_odd {
    	
    public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println();
        int even_sum = 0;
        int odd_sum = 0;
        while ((input / 10) != 0) {
            if ((input % 10) % 2 == 0) {
                even_sum = even_sum + input % 10;
                System.out.println(even_sum);
            } else {
                odd_sum = odd_sum + input % 10;
                System.out.println(odd_sum);
            }
            input = input / 10;
        }
        System.out.print(even_sum+" "+odd_sum);

        sc.close();
        

	}
}