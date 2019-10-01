package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		
		System.out.println("commander 도착");
		System.out.println(request.getParameter("action").toUpperCase());
		
		Command o = null;
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case CREATE :
			o = new CreateCommand(request);
			break;
		case SEARCH :
			o = new SearchCommand();
			break;
		case UPDATE : 
			break;
		case DELETE : 
			break;
		case MOVE :
			o = new MoveCommand(request);
			break;
		case LOGIN :
			o = new LoginCommand(request);
			break;
		case JOIN :
			o = new JoinCommand(request);
			break;
			
		default : 
			break;
		}
		return o;
	}
}
