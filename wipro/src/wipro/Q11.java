package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q11 {
	/*
	 * Given an array of type int, print true if every element is 1 or 4. 
	 * only14([1,4, 1, 4]) → true 
	 * only14([1, 4, 2, 4]) → false 
	 * only14([1, 1]) → true
	 */
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
//used to take input
/***********************************************************************/
		String s=sc.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (String st : s.split(",")) {
			st=st.trim(); //cleans white-spaces, if any, could cause error in integer conversion
			list.add(Integer.parseInt(st));
		}
/***********************************************************************/
//input ends
		boolean flag=true;
		for(Integer i : list) {
			if((i!=1)&&(i!=4)) {
				flag=false;
				break;  // terminate loop if even 1 case exists
			}
		}
		System.out.println(flag);
	}

}
