package com.soccer.web.commands;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class SearchCommand extends Command {

	public SearchCommand(HttpServletRequest request) {

		System.out.println("searchcommand 도착 : ");
		
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setPage("main");
		execute();
		request.setAttribute("page",request.getParameter("page"));
		request.setAttribute("positions", PlayerServiceImpl.getInstance().findPositions());
		System.out.println(request.getParameter("page"));
		System.out.println(view);
		
		
	}
	
	public void execute() {
		
		super.execute();
	}
	
}
