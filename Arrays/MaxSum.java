package InterviewBit.InterviewBit.Arrays;



/**
 * 
Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.
 *
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSum {
	public static void main(String[] args) {
		System.out.println("Maximum Sum Subarray");
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			list.add(sc.nextInt());
		}
		int maxsum = maxSubArray(list);
		System.out.println("Maximum Sum Subarray is" + maxsum);

	}

	public static int maxSubArray(final List<Integer> a) {

		if (allNumberNegative(a)) {
			int min = Integer.MIN_VALUE;
			for (int i = 0; i < a.size(); i++) {
				if (min < a.get(i)) {
					min = a.get(i);
				}
			}
			return min;
		}

		if (a.size() == 0)
			return 0;
		if (a.size() == 1) {
			return a.get(0);
		}
		int max_temp = 0;
		int max_sum = 0;

		for (int i = 1; i < a.size(); i++) {
			max_temp = max_temp + a.get(i);

			if (max_temp < 0) {
				max_temp = 0;
			}

			if (max_sum < max_temp) {
				max_sum = max_temp;
			}
		}
		return max_sum;
	}

	private static boolean allNumberNegative(List<Integer> a) {
		int count = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) < 0) {
				count++;
			}
		}
		if (count == a.size()) {
			return true;
		}
		return false;
	}
}
