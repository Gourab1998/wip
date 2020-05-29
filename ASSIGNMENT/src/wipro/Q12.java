package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q12 {
	/*
	 * Given 2 int arrays, a and b, each length 3, form a new array of length 2,
	 * containing their middle elements. 
	 * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
	 * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8] 
	 * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//used to take input
/***********************************************************************/
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
		String s=sc.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (String st : s.split(",")) {
			st=st.trim(); //cleans white-spaces, if any, could cause error in integer conversion
			list.add(Integer.parseInt(st));
		}
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
		s=sc.nextLine();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		for (String st : s.split(",")) {
			st=st.trim(); //cleans white-spaces, if any, could cause error in integer conversion
			list2.add(Integer.parseInt(st));
		}
/***********************************************************************/
//input ends
		int res[]= new int[2];
		res[0]= list.get(1);
		res[1]= list2.get(1);
		System.out.println(res[0]+", "+res[1]);
	}

}
