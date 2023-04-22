package com.habib.section9;

import java.util.Arrays;

public class Chapter3 {
	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		int[] arrCopy = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arrCopy));
		
		int[] arrSmall = Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(arrSmall));
		
		int[] arrBig = Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(arrBig));
		
	}

}
