package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{

	public MoveCommand(HttpServletRequest request) {

		System.out.println("movecommand 도착 : ");
		
		setRequest(request);
		setDomain("facade");
		setAction(request.getParameter("action"));
		setPage("main");
		request.setAttribute("page",request.getParameter("page"));
		execute();
	}
	
	public void execute() {
				
		super.execute();
	}
	
}
