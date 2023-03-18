package com.anandh;

import java.util.List;


public class MethodRefer2 {

	
	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(6,1,3,9,23,89,44);
		
		printListElements(numbers);
		printListEvenNumbers(numbers);
		printListOddNumbers(numbers);
		PrintListGreater(numbers);
		PrintListSquare(numbers);
		PrintListCube(numbers);
		
    }
	



	private static void printListElements(List<Integer> numbers) {
		numbers.stream()
		.forEach(System.out::println);
		
	}

	private static void printListEvenNumbers(List<Integer> numbers) {
		System.out.println("Even Numbers:");
		numbers.stream()
		.filter(x->x%2==0)
		.forEach(System.out::println);
		
	}
	private static void printListOddNumbers(List<Integer> numbers) {
		System.out.println("Odd Numbers:");
		numbers.stream()
		.filter(x->x%2!=0)
		.forEach(System.out::println);
	}
	
	private static void PrintListGreater(List<Integer> numbers) {
		System.out.println("Grater Than 10:");
		numbers.stream()
		.filter(x->x>10)
		.forEach(System.out::println);
		
	}
	
	private static void PrintListSquare(List<Integer> numbers) {
		System.out.println("Square of Array numbers:");
		numbers.stream()
		.map(x->x*x)
		.forEach(System.out::println);
		
	}
	
	private static void PrintListCube(List<Integer> numbers) {
		System.out.println("Cube of Array numbers:");
		numbers.stream()
		.map(x->x*x*x)
		.forEach(System.out::println);
		
	}

}