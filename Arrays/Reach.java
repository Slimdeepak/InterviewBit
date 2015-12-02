package InterviewBit;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * You are in an infinite 2D grid where you can move in any of the 8 directions :

 	(x,y) to 
    (x+1, y), 
    (x - 1, y), 
    (x, y+1), 
    (x, y-1), 
    (x-1, y-1), 
    (x+1,y+1), 
    (x-1,y+1), 
    (x+1,y-1) 
	You are given a sequence of points and the order in which you need to cover the points.
 	Give the minimum number of steps in which you can achieve it. You start from the first point.

Example :

Input : [(0, 0), (1, 1), (1, 2)]
Output : 2
 * @author Real SlimDeepak
 *
 */
public class Reach {
	
	public static void main(String[] args) {
		System.out.println("InterviewBit Reach Program");
		Reach reach = new Reach();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> X = new ArrayList<Integer>();
		ArrayList<Integer> Y = new ArrayList<Integer>();
		int N = sc.nextInt();
		
		for(int i=0;i<N;i++){
			X.add(sc.nextInt());
			Y.add(sc.nextInt());
		}
		
		int distance = reach.coverPoints(X, Y);
		System.out.println(distance);
	}
	
	 public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
		 int distance = 0;
		 for(int i=1;i<X.size();i++){
			 distance += Math.abs( (int)Math.max(Math.abs(X.get(i)-X.get(i-1)), Math.abs(Y.get(i)-Y.get(i-1))));
		 }
		return distance; 
	  }
}
