package com.behavioural.mediator;

public class ChatMain {

	
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new UserImpl(mediator, "udhay");
		User user2 = new UserImpl(mediator, "kumar");
		User user3 = new UserImpl(mediator, "krishna");
		User user4 = new UserImpl(mediator, "raj");
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		
		user4.send("Hi All");
		
	}

}
