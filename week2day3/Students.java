package week2.day3;

import org.student.Student;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
		
	}
	public void getStudentInfo(int id,String name) {
		System.out.println(id);
		System.out.println(name);
     }
	public void getStudentInfo(String email,long phoneNumber) {
		System.out.println(email);
		System.out.println(phoneNumber);
     }
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
Students stud1=new Students();
stud1.getStudentInfo(24);
stud1.getStudentInfo(16, "Babu");
stud1.getStudentInfo("xyz@gmail.com", 123456789);

	}

}
