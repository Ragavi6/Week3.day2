package week3.day2;

import java.util.ArrayList;

public class Findinterection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 *  f) Print the first array (should match item in both arrays)
		 */
		
	            int arr1 [] = {3,2,11,4,6,7};
				int arr2 [] = {1,2,8,4,9,7};
				int result;
				
				ArrayList<Integer>num = new ArrayList<Integer>();
				
				num.add(3);
				num.add(2);
				num.add(11);
				num.add(4);
				num.add(6);
				num.add(7);
				
				ArrayList<Integer>num1 = new ArrayList<Integer>();
				
				num1.add(1);
				num1.add(2);
				num1.add(8);
				num1.add(4);
				num1.add(9);
				num1.add(7);
				
				num.retainAll(num1);
				System.out.println(num);
				
				/*
				 * for (int i = 0; i < arr1.length; i++) {
				 * 
				 * for (Integer integer : num ) { if (num1.contains(integer)) {
				 * num.add(integer);
				 * 
				 * } System.out.println(num); }
				 * 
				 * }
				 */
				 
				

			}

		
	

	}


