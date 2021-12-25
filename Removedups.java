package week3.day2;

import java.util.LinkedHashSet;

import java.util.Set;


public class Removedups {
	
	public static void main(String[] args) {
		
		String input = "Paypal India";
		
		//USE SET TO REMOVE DUPS
		Set<Character> Charset = new LinkedHashSet<Character>();
		 for ( int i=0; i < input.length(); i++) {
			
		Charset.add(input.charAt(i));
	}
	
		for (Character eachchar : Charset) {
			if (eachchar!=' ')
				
				
			System.out.println(eachchar);
			
		} 
		

}
	
}
