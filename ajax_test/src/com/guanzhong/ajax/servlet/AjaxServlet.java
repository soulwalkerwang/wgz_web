package com.guanzhong.ajax.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AjaxServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException
	{
		try
		{
			resp.setContentType("text/html;charset=UTF-8");
			PrintWriter out = resp.getWriter();
			String old = req.getParameter("name");
			if(old == null || old.length() == 0)
			{
				out.print("username can not be empty");
			}else
			{
				String name = new String(old.getBytes("UTF-8"));
				if(name.equals("wgz"))
				{
					out.print("User " + name + " exist, please use another user");
				}else
				{
					out.print("User " + name + " available");
				}
			}
			out.print("<br/><a href=\"index.html\">Back</a>");
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	


}
