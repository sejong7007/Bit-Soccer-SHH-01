package com.soccer.web.commands;

import javax.servlet.http.HttpServletRequest;

public class Receiver {

	public static Command cmd = new Command();
	
	public void init(HttpServletRequest request) {
				
		cmd = Commander.direct(request);
		
	}
	
}
