package com.dummyproject;

public class PrintArray1 {
	public static <E> void toPrint(E[] inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
			Character[] charArray = {'H','E','L','L','O'};
			
			PrintArray1.toPrint(intArray);
			PrintArray1.toPrint(doubleArray);
			PrintArray1.toPrint(charArray);
	}
}
