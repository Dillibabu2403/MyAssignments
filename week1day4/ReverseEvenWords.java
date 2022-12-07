package week1.day4;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String s = "I am a software tester";
        String[] wordsArr = s.split(" "); 
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< wordsArr.length; i++){
            if(i%2 == 0) 
                sb.append(wordsArr[i]); 
            else sb.append(new StringBuilder(wordsArr[i]).reverse());
            sb.append(" ");
        }
        System.out.println(sb.toString().trim()); 
	}
}

