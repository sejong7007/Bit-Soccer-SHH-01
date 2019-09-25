package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

import com.soccer.web.pool.Constants;

public class Command implements Order {

	protected HttpServletRequest request;
	protected String action, domain, page, view;
	
		
	@Override
	public void execute(){
		
		request = Receiver.cmd.request;
		page = Receiver.cmd.page;
		action = Receiver.cmd.action;
		
		this.view = String.format(Constants.VIEW_PATH,page);
	}


	
}
