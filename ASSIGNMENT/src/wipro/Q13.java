package wipro;

public class Q13 {
	/*
	 * Write a program to reverse the elements of a given 2*2 array. Four integer
	 * numbers needs to be passed as Command Line arguments. 
	 * Example 
	 * 1)C:\>java Sample 1 2 3 
	 * O/P: Please enter 4 integer numbers 
	 * Example 
	 * 2)C:\>java Sample 1 2 3 4 
	 * O/P: The given array is : 
	 * 1 2 
	 * 3 4 
	 * The reverse of the array is : 
	 * 4 3 
	 * 2 1
	 */
	
	public static void main(String[] args) {
		if(args.length!=4) {
			System.out.println("Please enter 4 integer numbers");
		}
		else {
			int arr[][]=new int[2][2];
			int arr2[][]=new int[2][2];
			arr[0][0]=Integer.parseInt(args[0]);
			arr[0][1]=Integer.parseInt(args[1]);
			arr[1][0]=Integer.parseInt(args[2]);
			arr[1][1]=Integer.parseInt(args[3]);
			System.out.println("The given array is : ");
			System.out.println(arr[0][0]+" "+arr[0][1]+"\n"+arr[1][0]+" "+arr[1][1]);
			arr2[0][0]=arr[1][1];
			arr2[0][1]=arr[1][0];
			arr2[1][0]=arr[0][1];
			arr2[1][1]=arr[0][0];
			System.out.println("The reverse of the array is : ");
			System.out.println(arr2[0][0]+" "+arr2[0][1]+"\n"+arr2[1][0]+" "+arr2[1][1]);
		}
	}

}
