package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class JoinCommand extends Command{

	public JoinCommand(HttpServletRequest request) {
		
		System.out.println("joincommand 도착 : ");
		
		setRequest(request);
		setDomain(request.getServletPath()
				.substring(1,request.getServletPath().indexOf(".")));
		setAction(request.getParameter("action"));
		execute();
		
	}
	
	public void execute() {
		
		PlayerBean param = new PlayerBean();
		
		param.setBackNo(request.getParameter("backNo"));
		param.setBirthDate(request.getParameter("birthDate"));
		param.setEPlayerName(request.getParameter("ePlayerName"));
		param.setHeight(request.getParameter("height"));
		param.setJoinYyyy(request.getParameter("joinYyyy"));
		param.setNation(request.getParameter("nation"));
		param.setNickname(request.getParameter("nickname"));
		param.setPlayerId(request.getParameter("playerId"));
		param.setPlayerName(request.getParameter("playerName"));
		param.setPosition(request.getParameter("position"));
		param.setSolar(request.getParameter("solar"));
		param.setTeamId(request.getParameter("teamId"));
		param.setWeight(request.getParameter("weight"));
		
		PlayerServiceImpl.getInstance().join(param);
	}
	
	
	
}
