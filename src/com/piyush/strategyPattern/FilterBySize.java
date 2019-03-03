package com.piyush.strategyPattern;

/* * An implementation of Strategy interface, which decides to filter * message by size. */

public class FilterBySize implements FilteringStrategy {

	private int maxSize;

	public FilterBySize(int maxSize) {
		this.maxSize = maxSize;
	}

	@Override
	public boolean isFilterable(Message msg) {
		return msg.getSize() > maxSize;
	}

	@Override
	public String toString() {
		return "Filtering By maxSize: " + maxSize;
	}

}
