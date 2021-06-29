package com.qadiaries.scripts;

public class MissingNumber {

	public static int[] array = { 2, 4, 6, 8, 12 };

	public static int diff = 2;

	public static void main(String[] args) {

		for (int i = 0; i < array.length-1; i++) {

			if (array[i + 1] - array[i] == diff ) {
				continue;
			} else {
				int number = array[i] + diff;
				System.out.println("Missing Number is " +array[i + 1] +" "+ array[i]+"\n\n"+ number);
			}
		}
	}
}
