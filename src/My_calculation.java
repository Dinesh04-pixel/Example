
public class My_calculation extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The multiplication of a and b is: " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 10;
		My_calculation cal = new My_calculation();
		cal.addition(a, b);
		cal.subtraction(a, b);
		cal.multiplication(a, b);
	}

}
