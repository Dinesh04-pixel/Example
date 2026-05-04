package com.program;

public class Childwish extends Parentwish {
	public void wish() {
		System.out.println("Engineer");
		super.wish();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childwish aChild = new Childwish();
		aChild.wish();
	}

}
