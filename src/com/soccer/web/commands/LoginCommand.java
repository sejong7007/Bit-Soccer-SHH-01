package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class LoginCommand extends Command {

	public LoginCommand(HttpServletRequest request) {

		setRequest(request);
		
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		
		//setDomain("facade");
		setAction(request.getParameter("action"));
		request.setAttribute("page","2_positions");
		execute();
	}
	
	@SuppressWarnings("unused")
	public void execute() {
		
		PlayerBean param = new PlayerBean();
		param.setPlayerId(request.getParameter("playerId"));
		param.setSolar(request.getParameter("solar"));
						
		param = PlayerServiceImpl.getInstance().login(param);

		System.out.println(request.getParameter("page"));
		
		setPage((param!=null)? request.getParameter("page") :"login");
		
				
		super.execute();
	}
	
}
