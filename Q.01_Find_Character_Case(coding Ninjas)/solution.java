import java.util.*;

class Solution {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc =new Scanner(System.in);
        int user_input=sc.next().charAt(0);

        if( user_input>=97 && user_input<122 ){
            System.out.println(0);
        }
        else if( user_input>=65 && user_input<90 ){
            System.out.println(1);
        }
        else{
            System.out.println(-1);
        }

    }
}