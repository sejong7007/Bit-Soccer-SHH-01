package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand extends Command {

	public LoginCommand(HttpServletRequest request) {
					
	}
	
	public void execute() {
		super.execute();
		Receiver.cmd.request = request;
		Receiver.cmd.action = request.getParameter("action");
		Receiver.cmd.page = request.getParameter("page");
	}
	
}
