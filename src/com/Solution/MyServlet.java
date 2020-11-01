package com.Solution;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

@WebServlet("/upload")
public class MyServlet extends HttpServlet {
@Override
public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	Enumeration<String> e= req.getParameterNames();
	System.out.println("parameter names");
	while(e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	String[] files=req.getParameterValues("fileInput");
	for(int i=0;i<files.length;i++) {
		System.out.println(files[i]);
	}
	
	
	
	
	
	req.getRequestDispatcher("upload.jsp").forward(req, res);
}
}
