package com.usk.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Q1Login extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	public void init() {
		
		System.out.println("init");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

		response.setContentType("text/html");

		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ap\",\"root\",\"Ee3107695!");
			PreparedStatement psmt = con.prepareStatement("Select * from user_name = ? and password  = ?");
			psmt.setString(1, userName);
			psmt.setString(2, password);
			
			psmt.executeQuery();
			
			ResultSet rs = psmt.executeQuery();
			
			if(rs.next()) {
				out.println("Welcome " + userName);
			}
			else {
				out.println("Invalid. Please try again.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		boolean loginSuccess = true;
		
		if (userName != null) {
			loginSuccess = false;
		}
		if(loginSuccess) {
			response.sendRedirect("./welcome.html");
		}
		else {
			response.sendRedirect("./loginError.html");

		}
	}
	
	
}