package com.guanzhong.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxXMLServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		try
		{
			resp.setContentType("text/xml;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			String old = req.getParameter("name");
			if(old == null || old.length() == 0)
			{
				out.print("username can not be empty");
			}else
			{
				String name = new String(old.getBytes("UTF-8"));
				
				StringBuffer bf = new StringBuffer();
				
				bf.append("<message>");
				
				if(name.equals("wgz"))
				{
					bf.append("User " + name + " exist, please use another user").append("</message>");
					
				}else
				{
					bf.append("User " + name + " available").append("</message>");
					
				}
				out.println(bf.toString());
			}
			
		
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
