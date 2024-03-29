package com.soccer.web.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.soccer.web.commands.Receiver;
import com.soccer.web.commands.Sender;


@WebServlet("/player.do")
public class PlayerController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("playercontroller 도착");
	
		
		Receiver.init(request);
		Sender.forward(request, response);
		
	}
}
