package com.guanzhong.ejb.helloworld;

import javax.ejb.Remote;
import javax.ejb.Stateless;


@Stateless
@Remote
public class FirstEJBBean implements FirstEJB
{
	@Override
	public String saySomething(String name)
	{
		return "hello " + name;
	}

}
