package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.domains.PlayerBean;
import com.soccer.web.serviceimpls.PlayerServiceImpl;

public class CreateCommand extends Command {

	public CreateCommand(HttpServletRequest request) {
	
		setRequest(request);
		setDomain("facade");
		setAction(request.getParameter("action"));
		setPage("main");
		super.execute();
		execute();
		
	}
	
	
	public void execute() {
		
		PlayerBean param = new PlayerBean();
		
		//param.setBackNo(request.getParameter("backNo"));
		//param.setBirthDate(request.getParameter("birthDate"));
		//param.setEPlayerName(request.getParameter("ePlayerName"));
		//param.setHeight(request.getParameter("height"));
		//param.setJoinYyyy(request.getParameter("joinYyyy"));
		//param.setNation(request.getParameter("nation"));
		//param.setNickname(request.getParameter("nickname"));
		param.setPlayerId(request.getParameter("playerId"));
		param.setPlayerName(request.getParameter("playerName"));
		//param.setPosition(request.getParameter("position"));
		param.setSolar(request.getParameter("solar"));
		param.setTeamId(request.getParameter("teamId"));
		//param.setWeight(request.getParameter("weight"));
		
		if(PlayerServiceImpl.getInstance().join(param)) {
			System.out.println("회원가입성공");
		}else {
			System.out.println("회원가입실패");
		}
	}
	
	
}
