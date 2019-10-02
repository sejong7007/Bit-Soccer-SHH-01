package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class MoveCommand extends Command{

	public MoveCommand(HttpServletRequest request) {

		System.out.println("movecommand 도착 : ");
		
		setRequest(request);
		
		switch(request.getParameter("page")) {
		case "login": 
			setDomain("facade");
			break;
		case "join": 
			setDomain("facade");
			break;
		case "a_back": 
			setDomain("facade");
			break;
		
		default:
			setDomain(request.getServletPath()
					.substring(1,request.getServletPath().indexOf(".")));
			break;
		}
		
		setAction(request.getParameter("action"));
		setPage("main");
		request.setAttribute("page",request.getParameter("page"));
		execute();
	}
	
	public void execute() {
				
		super.execute();
	}
	
}
