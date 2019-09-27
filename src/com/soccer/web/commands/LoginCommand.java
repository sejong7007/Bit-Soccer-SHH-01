package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command {

	public LoginCommand(HttpServletRequest request) {

		setRequest(request);
		/*
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		*/
		setDomain("facade");
		setAction(request.getParameter("action"));
		execute();
	}
	
	public void execute() {
		
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
						
		PlayerServiceImpl.getInstance().login(param);
		setPage(request.getParameter("page"));
				
		super.execute();
	}
	
}
