package com.coderscampus.arraylist;

public class CustomListApplication {

	public static void main(String[] args) {
		
		CustomList<String> myCustomList = new CustomArrayList<>();

		for (int i = 1; i <= 40; i++) {
			myCustomList.add("element " + i); 
		}
		
		for (int i = 0; i < myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));
		}
	}

}
