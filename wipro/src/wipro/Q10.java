package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
	/*
	 * Print an array that contains the exact same numbers as the given array, but
	 * rearranged so that all the even numbers come before all the odd numbers.
	 * Other than that, the numbers can be in any order. You may modify and print
	 * the given array, or make a new array.
	 * 
	 * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1] 
	 * evenOdd([3, 3, 2]) →[2, 3, 3]
	 */
	public static void main(String[] args) {
		//advice:- learn collection of java before proceeding coding becomes much easier
		//can also be done using regular array but causes wastage of memory. 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
		String s=sc.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<Integer> even=new ArrayList<Integer>();
		ArrayList<Integer> odd=new ArrayList<Integer>();
		for (String st : s.split(",")) {
			st=st.trim();
			list.add(Integer.parseInt(st));
		}
		for(Integer i:list) {
			if(i%2==0) {
				even.add(i);
			}
			else {
				odd.add(i);
			}
		}
		even.addAll(odd);
		for(Integer i:even) {
			System.out.print(i+", ");
		}
	}

}
