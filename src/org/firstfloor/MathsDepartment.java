package org.firstfloor;

public class MathsDepartment extends ScienceDepartment{
	
	public void selvaMani() {
		System.out.println("Hi This is selva");

	}
	
	public void kevinAarosh() {
		System.out.println("Hi This is Kevin");

	}
	
	public void weekEnd() {
		System.out.println("Sunday");
	}
	
	public static void main(String[] args) {
		MathsDepartment m = new MathsDepartment();
		m.kevinAarosh();
		
		m.maniKandan();
		m.suryaSubramani();
		m.udhayaMoorthy();
		
		System.out.println(m);
	}

}
