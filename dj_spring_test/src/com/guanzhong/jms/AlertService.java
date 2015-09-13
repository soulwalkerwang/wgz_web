package com.guanzhong.jms;

import com.guanzhong.domain.Spittle;

public interface AlertService
{
	void sendSpittleAlert(Spittle spittle);
	Spittle receiveSpittleAlert();

}
