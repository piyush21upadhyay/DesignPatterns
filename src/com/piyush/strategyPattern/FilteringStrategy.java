package com.piyush.strategyPattern;

/* * interface which defines Strategy for this pattern. */
public interface FilteringStrategy {
	public boolean isFilterable(Message msg);
}
