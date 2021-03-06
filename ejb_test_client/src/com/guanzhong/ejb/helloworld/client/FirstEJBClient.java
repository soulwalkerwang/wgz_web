package com.guanzhong.ejb.helloworld.client;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.guanzhong.ejb.helloworld.FirstEJB;

public class FirstEJBClient
{
	public static void main(String[] args) throws Exception
	{
		final Hashtable<String, String> jndiProperties = new Hashtable<String, String>();
		jndiProperties.put(Context.URL_PKG_PREFIXES,
				"org.jboss.ejb.client.naming");
		final Context context = new InitialContext(jndiProperties);

		final String appName = ""; // 这里是.EAR包的名称，如果你打包成JAR发布的话，这里则留空

		final String moduleName = "ejb_test"; // 这里是你发布的JAR文件名，如helloworld.jar,则这里应该为helloworld。去掉后缀即可

		final String distinctName = ""; // 如果没有定义其更详细的名称，则这里留空

		final String beanName = "FirstEJBBean"; // 这里为实现类的名称

		final String viewClassName = FirstEJB.class.getName(); // 这里为你的接口名称
		System.out.println(viewClassName);
		try
		{
			String jndi = "ejb:" + appName + "/"
					+ moduleName + "/" + distinctName + "/" + beanName + "!"
					+ viewClassName;
			System.out.println(jndi);
			FirstEJB hw = (FirstEJB) context.lookup(jndi);
			System.out.println(hw.saySomething("wgz"));
		} catch (NamingException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
