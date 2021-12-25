package week3.day2;
import java.util.ArrayList;

import java.util.Collections;
import java.util.Arrays;


public class FindSecondLargest {

	public static void main(String[] args) {
		int [] data = {3,2,11,4,6,7};
		ArrayList<Integer> n =new ArrayList<Integer>();
		n.add(3);
		n.add(2);
		n.add(11);	
		n.add(4);
		n.add(6);
		n.add(7);		
		
		Collections.sort(n);		
//		System.out.println(n);
		
		System.out.println(n.get(6-2));

	}



	}


