package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q8 {

//	Write a program to print the sum of the elements of an array following the given below condition.
//	If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers
//	for calculation of sum.
//	Eg1) Array Elements - 10,3,6,1,2,7,9
//	O/P: 22
//	[i.e 10+3+9]
//	One
//	dimensional
//	Array
//	Eg2) Array Elements - 7,1,2,3,6
//	O/P:19
//	Eg3) Array Elements - 1,6,4,7,9
//	O/P:10
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// here sum is to store ultimate sum of valid sequence.
		// here sum2 is to store temporary sum when a 6 has been found(i.e flag==1).
		// here flag acts as signaling variable if 6 has been found
		// and stays 1 unless a 7 found.
		int sum=0,sum2=0,flag=0;
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
		String s=sc.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (String i : s.split(",")) {
			list.add(Integer.parseInt(i));
		}
		for (Integer i: list) {
			if (i==6) {				//check if 6 or not
				if(flag==1) {		//if 6 was already existing as in case "6, 8, 9, 6,4,5,7"
					sum=sum+sum2;	//save all temporary sum2 to sum
					sum2=0;			//clear all value in sum2
				}
				else {
					flag=1;			//if occurrence of 6 is for first time
				}
			}
			if (flag==1) {		
				if(i!=7) {
					sum2=sum2+i;	// if 6 occurred(i.e flag==1) and i is not 7
				}					// then add to temporary sum2.
				else {
					sum2=0;			// if 6 occurred(i.e flag==1) and i is 7
					flag=0;			// delete all values in sum2 and reset signaling bit.
				}
			}
			else {
				sum=sum+i;			// if 6 sequence has not occurred then add normally
			}
		}
		sum=sum+sum2;				// for any value remaining in temporary sum2 i.e 6 occurrence started but not finished eg.- "8,9,6,4,5" 
		System.out.println(sum);
	}
}
