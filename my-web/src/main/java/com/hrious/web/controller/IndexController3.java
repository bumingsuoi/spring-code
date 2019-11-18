package com.hrious.web.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component("/index3.do")
public class IndexController3 implements HttpRequestHandler {
	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("HttpRequestHandler..");
	}
}
