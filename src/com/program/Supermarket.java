package com.program;

public class Supermarket {
Supermarket(int a)
{
	System.out.println(a);
}
Supermarket(String s)
{
	System.out.println(s);
}
Supermarket()
{
	System.out.println("This is non parameterized or default constructor");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supermarket s = new Supermarket(5);
Supermarket s1 = new Supermarket("Dinesh");
Supermarket s2 = new Supermarket();
	}

}
