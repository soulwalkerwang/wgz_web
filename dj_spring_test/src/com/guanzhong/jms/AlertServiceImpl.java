package com.guanzhong.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.JmsUtils;
import org.springframework.stereotype.Component;

import com.guanzhong.domain.Spittle;

@Component("alertService")
public class AlertServiceImpl implements AlertService
{
	
	private JmsOperations jmsOperations;
	
	
	@Autowired
	public AlertServiceImpl(JmsOperations jmsOperations)
	{
		this.jmsOperations = jmsOperations;
	}



	@Override
	public void sendSpittleAlert(final Spittle spittle)
	{
		jmsOperations.send("spittle.alert.queue", new MessageCreator()
		{
			
			@Override
			public Message createMessage(Session session) throws JMSException
			{
				return session.createObjectMessage(spittle);
			}
		});
		

	}
	
	@Override
	public Spittle receiveSpittleAlert()
	{
		try
		{
			ObjectMessage receivedMessage = (ObjectMessage) jmsOperations.receive();
			return (Spittle)receivedMessage.getObject();
		} catch (JMSException e)
		{
			throw JmsUtils.convertJmsAccessException(e);
		}
		
	}

}
