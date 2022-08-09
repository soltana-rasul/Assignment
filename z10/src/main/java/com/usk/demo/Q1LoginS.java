package com.usk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/login2")
public class Q1LoginS extends GenericServlet{

	private static final long serialVersionUID = 1L;

	public void init() {
		System.out.println("in init");
	}
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Hey <br/>");
		out.println("Welcome to servlet interface example");
	}
	

}
