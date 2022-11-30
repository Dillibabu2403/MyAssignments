package week2.day3;

public class AxisBank extends BankInfo{
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit is overrided");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank axis=new AxisBank();
axis.deposit();
	}

}
