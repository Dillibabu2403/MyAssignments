package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactersCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cmp = "PayPal India";
		char[] charArray = cmp.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for (Character ch : charArray) 
		{
			charSet.add(ch);
		}
		for (Character ch : charSet) 
		{
			if(!ch.equals(' '))
			{
				System.out.print(ch);
			}
		}
	}

}
