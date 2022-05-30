package org.thirdfloor;

public  class C {
	
	public C() {
		this(12);
		System.out.println("c");
	}
	
	public C(int i) {
		System.out.println("arg");
	}
	
	public void test() {
		

	}
	
    public int test(int i) {
		
    	int j = 2;
    	int k = i + j;
    	
    	return k;

	}
    
   public void test(String i) {
		
	   

	}
	
	public static void main(String[] args) {
		
		C c = new C();
		
		
		
	}
	 

}
