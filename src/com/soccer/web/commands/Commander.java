package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;
import com.soccer.web.enums.Action;

public class Commander {

	public static Command direct(HttpServletRequest request) {
		
		Command o = null;
		
		switch(Action.valueOf(request.getParameter("action").toUpperCase())) {
		case MOVE :
			o = new MoveCommand();
			break;
		case SEARCH :
			o = new SearchCommand();
			break;
		case LOGIN :
			o = new LoginCommand(request);
			break;
		}
		return o;
	}
}
