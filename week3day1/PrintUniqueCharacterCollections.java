package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacterCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Dilli babu";
char[]charArray=str.toCharArray();
Set<Character>word=new LinkedHashSet<Character>();
for (Character ch : charArray) {
	word.add(ch);
}
System.out.println(word);
	}

}
