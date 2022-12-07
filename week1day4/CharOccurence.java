package week1.day4;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "welcome to chennai";
		  char search = 'e';      
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search)
		      count++;
		  }
		  
		  System.out.println("The Character '"+search+"' appears "+count+" times.");
	}

}
