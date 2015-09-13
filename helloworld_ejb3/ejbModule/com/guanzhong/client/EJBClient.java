package com.guanzhong.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.guanzhong.ejb3.HelloWorld;
import com.guanzhong.ejb3.impl.HelloWorldBean;

public class EJBClient
{
	public static void main(String[] args) throws NamingException
	{
//		Properties props = new Properties();
//		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
//		props.setProperty("java.naming.provider.url", "localhost:1099");
//		try
//		{
//			InitialContext ctx = new InitialContext(props);
//			HelloWorld helloworld = (HelloWorld) ctx.lookup("HelloWorldBean/remote");
//			System.out.println(helloworld.sayHello("guanzhong"));
//		} catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		
		Properties properties = new Properties();
        properties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
   
        final Context context = new InitialContext(properties);

        final String appName = "";        //这里是.EAR包的名称，如果你打包成JAR发布的话，这里则留空

        final String moduleName = "helloworld_ejb3";        //这里是你发布的JAR文件名，如helloworld.jar,则这里应该为helloworld。去掉后缀即可

        final String distinctName = "";                  //如果没有定义其更详细的名称，则这里留空

        final String beanName = HelloWorldBean.class.getSimpleName();           //这里为实现类的名称

        final String viewClassName = HelloWorld.class.getName();        //这里为你的接口名称
        
        
        try {
              HelloWorld hw = (HelloWorld) context.lookup("ejb:" + appName + "/" + moduleName + "/" + distinctName + "/" + beanName + "!" + viewClassName);
              
              System.out.println(hw.sayHello("Guanzhong"));
              context.close();
            } catch (NamingException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
            }
	}
	

}
