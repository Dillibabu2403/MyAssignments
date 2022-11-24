package week1.day4;

public class FindTypesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="$$ Welcome to 2nd Class of Automation $$ ";
int  letter = 0, space = 0, num = 0, specialChar = 0;
char[] ch = str.toCharArray();
for (int i = 0; i < ch.length; i++) {
	if(Character.isLetter(ch[i])) {
		letter++;
	}
	else if(Character.isDigit(ch[i])){
		num++;
	}
	else if(Character.isSpace(ch[i])) {
		space++;
	}
	else {
		
		specialChar++;
	}
}
System.out.println("Letters:" + letter);
System.out.println("Numbers:"+num);
System.out.println("Space:"+space);
System.out.println("specialChar:"+specialChar);

	}

}
