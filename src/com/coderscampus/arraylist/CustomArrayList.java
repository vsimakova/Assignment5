package com.coderscampus.arraylist;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	private T[] items;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 10;
	
	public CustomArrayList() {
		this(DEFAULT_CAPACITY);
	}
	
	@SuppressWarnings("unchecked")
	public CustomArrayList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("capacity is less than 0.");
		}
		items = (T[]) new Object[capacity];
		size = 0;
	}

	@Override
	public boolean add(T item) {
		if ((size + 1) > items.length) {
			int newCapacity = items.length * 2;
			//System.out.println(newCapacity);
			items = Arrays.copyOf(items, newCapacity);
		}
		items[size] = item;
		size++;
		return false;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public T get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index is out of bounds.");
		}
		return items[index];
	}
	
}
