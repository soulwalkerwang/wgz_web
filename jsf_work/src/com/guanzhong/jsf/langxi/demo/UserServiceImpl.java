package com.guanzhong.jsf.langxi.demo;

public class UserServiceImpl implements IUserService
{
	private User user;
	

	public User getUser()
	{
		return user;
	}


	public void setUser(User user)
	{
		this.user = user;
	}


	@Override
	public String login()
	{
		if(user.getUserName().equals("wgz")&&user.getPassword().equals("123456"))
		{
			return "success";
		}else
		{
			return "fail";
		}
	}

}
