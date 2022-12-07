package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1";
		Set <String> obj = new LinkedHashSet<String>();
		String[] split = text.split(" ");
		for (String word : split) 
		{
			obj.add(word);
		}
		System.out.println(obj);
	}

}
