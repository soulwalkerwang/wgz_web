package com.guanzhong.test;

import javax.jms.ObjectMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.guanzhong.domain.Spittle;
import com.guanzhong.jms.AlertService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext-services.xml"})
public class TestAlertService
{
	@Autowired
	AlertService alertService;
	
	@Test
	public void testSendSpittleAlert()
	{
		Spittle spittle = new Spittle();
		spittle.setAlert("ALERT");
		
		alertService.sendSpittleAlert(spittle);
	}
	
	@Test
	public void testReceiveSpittle()
	{
		System.out.println(alertService.receiveSpittleAlert().getAlert());
	}

}
