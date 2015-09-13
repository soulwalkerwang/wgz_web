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

		final String appName = ""; // ������.EAR�������ƣ����������JAR�����Ļ�������������

		final String moduleName = "ejb_test"; // �������㷢����JAR�ļ�������helloworld.jar,������Ӧ��Ϊhelloworld��ȥ����׺����

		final String distinctName = ""; // ���û�ж��������ϸ�����ƣ�����������

		final String beanName = "FirstEJBBean"; // ����Ϊʵ���������

		final String viewClassName = FirstEJB.class.getName(); // ����Ϊ��Ľӿ�����
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
