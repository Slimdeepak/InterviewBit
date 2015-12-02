package InterviewBit.InterviewBit.Arrays;


/*
 
Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.


 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Plus1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> input = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			input.add(sc.nextInt());
		}
		ArrayList<Integer> result = plusOne(input);
		System.out.println(result);

	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {

		ArrayList<Integer> output = new ArrayList<Integer>();
		int carry = 1;
		int sum = 0;

		for (int i = a.size() - 1; i >= 0; i--) {
			sum = carry + a.get(i);

			if (sum >= 10) {
				output.add(sum % 10);
				carry = 1;
			} else {
				output.add(sum);
				carry = 0;
			}
		}
		if (carry == 1) {
			output.add(1);
		}
		Collections.reverse(output);

		for (int i = 0; i < output.size(); i++) {
			if (output.get(i) == 0) {
				output.remove(i);
				// Never forget to put i--
				i--;
				// System.out.println(output);
			} else {
				return output;
			}
		}
		return output;
	}
}
