package com.soccer.web.commands;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sender {

		public void forward(HttpServletRequest request, HttpServletResponse response) {
			
			try {
				request
				.getRequestDispatcher(Receiver.cmd.view)
				.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
		
		public void redirect(HttpServletRequest request, HttpServletResponse response) {
			
			try {
				response
				.sendRedirect("");
			} catch (Exception e) {
				e.printStackTrace();
			} 
			
		}
	
}
