package org.one;

public class Stringword {
	
	public static void selectedword() {
		String s="hai this is prabhu";
		String[] split = s.split(" ");
		String d="";
		for(int i=0;i<split.length;i++)
		{
			System.out.print(split[i].charAt(0));
		}
//		for (String string : split) {
//		System.out.print(string.charAt(0));	
//		}
		
	}
	public static void main(String[] args) {
		selectedword();
	}
}
