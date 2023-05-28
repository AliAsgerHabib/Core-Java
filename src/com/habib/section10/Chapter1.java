package com.habib.section10;

import java.util.ArrayList;
import java.util.List;

public class Chapter1 {
	public static void main(String[] args) {
		String[] items = {"apples","bananas","milk","eggs"};
		ArrayList<String> list = new ArrayList<>(List.of(items));
		ArrayList<String> names = new ArrayList<>(List.of("Jarvis", "Friday", "Edith"));
		System.out.println(list);
		System.out.println(names);
	}
}