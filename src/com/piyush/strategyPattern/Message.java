package com.piyush.strategyPattern;

public class Message {
	MessageType messageType;
	int size;
	String content;

	public Message(MessageType type, int size, String content) {
		this.messageType = type;
		this.size = size;
		this.content = content;
	}

	public MessageType getMessageType() {
		return messageType;
	}

	public int getSize() {
		return size;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Message [messageType=" + messageType + ", size=" + size + ", content=" + content + "]";
	}

}
