package com.usk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServerlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String userName = request.getParameter("username");
		String gender = request.getParameter("gender");
		String duration = request.getParameter("duration");
		
		String[] subject = request.getParameterValues("subject");

		String setsub = "";
		for(String sub : subject) {
			setsub = setsub + sub;
		}
		
		PrintWriter out = response.getWriter();
		out.println(userName+" "+gender+ " "+duration+ " "+ setsub );

	}
}
