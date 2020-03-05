// Michael C Fralish
// 02/04/2020
// Lab 4
// Title: minGap

import java.util.*;

public class minGap {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("Welcome to minGap.\nHow many integers in the array?");
		int length = scan.nextInt();
		
		int[] arr= new int[length];
		
		if(length<1) {
			System.out.println("There are not enough elements in this array to determine"+
		" the distance between elements.\nThere is no gap between elements.");
		}
		else if(length == 1) {
			System.out.println("What is the first integer in the array?");
			arr[0] = scan.nextInt();
			System.out.println("There are not enough elements in this array to determine"+
					" the distance between elements.\nThere is no gap between elements.");
		}
		else {		
		System.out.println("What is the first integer in the array?");
		arr[0] = scan.nextInt();
		
		for (int i=1;i<length-1;i++) {
			System.out.println("What is the next integer in the array?");
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Finally, what is the last integer in the array?");
		arr[length-1] = scan.nextInt();
		
		System.out.println("The minimum distance between adjacent integers in the array is: "+
		miniGap(arr));
		
		scan.close();
		}
	}
	
	public static int miniGap(int[] arr) {
		int min = Math.abs(arr[0]-arr[1]);
		int temp = 0;
		
		for(int i=0;i<arr.length-1;i++) {
			temp = Math.abs(arr[i]-arr[i+1]);
			if (temp<min) min=temp;			
		}
		
		return min;
	}

}
