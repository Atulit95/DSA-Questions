import java.util.Scanner;

public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int first_element=1;
		int next_element = 1;
		int third_element = first_element + next_element;
		
		if (n == 1) {
			System.out.println(first_element);
		}
		else if (n == 2) {
			System.out.println(next_element);
		}
		else {
			for (int i = 1; i <= n-2; i++) {
				third_element = first_element + next_element;
				first_element = next_element;
				next_element = third_element;
			}
			System.out.println(third_element);
		}
		sc.close();
	}

}
