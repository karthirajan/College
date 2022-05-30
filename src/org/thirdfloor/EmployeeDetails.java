package org.thirdfloor;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		String s = "Welcome to java"; //7 letters
		
		String[] s1 = s.split(" ");
		for (String s2 : s1) {
			
			System.out.println(s2);
			
		}
		
		String trim = s.trim();
		System.out.println(trim);
		
		int k = s.indexOf('a');
		System.out.println(k);
		
		int l = s.lastIndexOf('a');
		System.out.println(l);
		
		int i = s.length();
		System.out.println(i);
		
	    char ch = s.charAt(0);
		System.out.println(ch);
		
		for (int j = 0; j < s.length(); j++) {
			
			char ch1 = s.charAt(j);
			System.out.println(ch1);
			
		}
		
		boolean b = s.contains("to");
		System.out.println(b);
		
		boolean c = s.startsWith("Wel");
		System.out.println(c);
		
		boolean d = s.endsWith("a");
		System.out.println(d);
		
		String cap = s.toUpperCase();
		System.out.println(cap);
		
		String small = cap.toLowerCase();
		System.out.println(small);
		
		boolean e = s.equals(cap);
		System.out.println(e);
		
		boolean f = s.equalsIgnoreCase(cap);
		System.out.println(f);
		
	}
	

}
