package com.piyush.adaptorPattern;

/**
 * The java.util.Map has no way to * automatically load a two dimensional array of objects into a Map as key-value * pairs. 
 * This Java program creates an adapter class that does this.
 * **/

public class AdapterTest {

	public static void main(String[] args) {
		Integer[][] squares = { { 2, 4 }, { 3, 9 }, { 4, 16 } };

		MapAdapter adapter = new MapAdapter(squares);

		System.out.println("adapter map contains::" + adapter);
	}

}
