package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator obj=new Calculator();
int add = obj.add(23, 10, 50);
System.out.println(add);
int sub = obj.sub(15, 10);
System.out.println(sub);
double mul = obj.mul(5.888, 2.55888);
System.out.println(mul);
float divide = obj.divide(12.3f, 3.0F);
System.out.println(divide);

	}
}