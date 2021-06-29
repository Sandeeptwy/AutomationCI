package com.qadiaries.scripts;

public class SecondHigestNumber {

	public static int[] num = { 2, 1, 4, 5, 8, 6 };

	public static void main(String[] args) {
		int max = 0;

		// send max number to first index, second to second

		

		for (int start = 0; start < 2; start++) {
			max = num[start];
			for (int i = 0; i < num.length; i++) {
				if (num[i] > max) {

					// Swap highest number to 0th Index
					int rep = num[start];
					num[start] = num[i];
					num[i] = rep;
					continue;

				}
			}
		}
		System.out.println(""+num[1]);
	}
}
