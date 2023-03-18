package com.anandh;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class MethodRefer3 {

	
	public static void main(String[] args) {
		Stream<String> stream=Stream.of("Hello","Hi");
		stream.forEach(System.out::println);
		
		Collection<String> collection=Arrays.asList("JAVA","j2ee","Spring","Hibenate");
		Stream<String> stream1=collection.stream();
		stream1.forEach(System.out::println);
		
		List<String> list=Arrays.asList("JAVA","j2ee","Spring","Hibenate");
		Stream<String> stream2=list.stream();
		stream2.forEach(System.out::println);
		
		Set<String> set= new HashSet<>(list);
		Stream<String> stream3=list.stream();
		stream3.forEach(System.out::println);
		
		String [] strArrays= {"a","b","c","e","d"};
		Stream<String> stream4=Arrays.stream(strArrays);
		stream4.forEach(System.out::println);
	}

}