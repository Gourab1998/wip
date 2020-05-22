package wipro;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9 {
//	Print a version of the given array where all the 10's have been removed. The remaining elements should shift left
//	towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So {1, 10, 10,
//	2} yields {1, 2, 0, 0}. You may modify and display the given array or make a new array.
//	withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0]
//	withoutTen([10, 2, 10]) → [2, 0, 0]
//	withoutTen([1, 99, 10]) → [1, 99, 0]
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int i,j;
		System.out.println("Enter array of numbers as \n eg:- \"10,3,6,1,2,7,9\"");
		String s=sc.nextLine();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for (String st : s.split(",")) {
			st=st.trim();
			list.add(Integer.parseInt(st));
		}
		// this part not recommended but done to make the code easier to understand.
		//converts ArrayList<Integer> collection to int[].
/***********************************************************************/
		int arr[]=new int[list.size()]; 
		for (i=0;i<list.size();i++) {
			arr[i]=list.get(i);
		}
/***********************************************************************/
		i=0;
		while(i<arr.length) {
			if(arr[i]==10) {			
				for(j=i;j<arr.length;j++) {
					if(j==arr.length-1){
						arr[j]=0;
					}
					else {
						arr[j]=arr[j+1];
						arr[j+1]=0;	
					}
				}
			}
			else {
				i++;		//if arr[i] != 10 then proceed
			}
		}
		for(i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
