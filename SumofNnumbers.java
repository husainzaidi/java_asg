package com.geeks;

public class SumofNnumbers {
	public static void main(String args[]) {
		int[] arr = {3,9,10,11,35,36,33,41,56};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}



