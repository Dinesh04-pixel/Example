
public class My_anothercalculation extends My_calculation {
	public void division(int x, int y) {
		z = x / y;
		System.out.println("The division of x and y is: " + z);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 2;
		My_anothercalculation calc = new My_anothercalculation();
		calc.division(x, y);
		calc.multiplication(x, y);
		calc.addition(x, y);
		calc.subtraction(x, y);
	}

}
