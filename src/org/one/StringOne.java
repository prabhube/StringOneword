package org.one;

public class StringOne {
	public static void main(String[] args) {
		String a="hai";
		int ref=System.identityHashCode(a);
		System.out.println(ref);
		String b="hai";
		int ne = System.identityHashCode(b);
		System.out.println(ne);
		
		String s1=new String("java");
		int nonli = System.identityHashCode(s1);
		System.out.println(nonli);
		String s2=new String("java");
		int cee = System.identityHashCode(s2);
		System.out.println(cee);
	}
}
