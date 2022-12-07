package week1.day4;

public class PalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String word = "madam";
String rev="";
for (int i = word.length()-1; i>=0; i--) {
	rev = rev+word.charAt(i);
}
System.out.println(rev);
if(word.equals(rev)) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not Palindrome");
}
	}

}
