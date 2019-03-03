package com.piyush.strategyPattern;

/* * An implementation of Strategy interface, which decides to filter * message by type. */

public class FilterByType implements FilteringStrategy {

	private MessageType msgType;

	public FilterByType(MessageType msgType) {
		this.msgType = msgType;
	}

	@Override
	public boolean isFilterable(Message msg) {
		return msgType == msg.getMessageType();
	}

	@Override
	public String toString() {
		return "FilterByType [msgType=" + msgType + "]";
	}

}
