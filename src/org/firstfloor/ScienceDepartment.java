package org.firstfloor;

// Pascal or init notation
public class ScienceDepartment {
	
	// () - parenthesis
	// {} - brackets
	// [] - array
	public void udhayaMoorthy(){
		// logics
		System.out.println("Hi This is udhaya");
	}
	
	// camal notation
	public void suryaSubramani(){
		
		System.out.println("Hi This is surya");
	}
	
	public void maniKandan(){
		
		System.out.println("Hi This is manikandan");
		
	}
	
	public void kevinAarosh() {
		System.out.println("Hi This is Kevin");

	}
	
	public static void main(String[] args){
		
		//ClassName obj = new ClassName();
		ScienceDepartment science = new ScienceDepartment();
		science.udhayaMoorthy();
		science.suryaSubramani();
		science.maniKandan();
		
	}

}
