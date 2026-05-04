package com.program;

public class Overloading {
public int add(int a, int b)
{
	return a+b;
}
public int add(int a, int b, int c)
{
	return a+b+c;
}
public double add(double a, double b)
{
	return a+b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o = new Overloading();
System.out.println(o.add(10, 20));
System.out.println(o.add(5, 10, 5));
System.out.println(o.add(4.5, 4.5));
	}

}
