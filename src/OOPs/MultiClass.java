package day4;

public class MultiClass extends SimpleCalc{
	
	
	public void calculate() {
		value-=3;
	}
	
	public void calculate(int multiplier) {
		calculate();
		super.calculate();
		value*=multiplier;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiClass mc=new MultiClass();
		mc.calculate(2);
		System.out.println(mc.value);
	}

}
