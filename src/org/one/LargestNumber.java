package org.one;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int arr[] = {12,32,56,-123,986,653,43};
//		Arrays.sort(arr);
//		System.out.println(arr[arr.length-1]);
		int max= arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max= arr[i];
			}
		}
		System.out.println(max);
		
		
		}
}
