package com.guanzhong.cxf.service;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import com.guanzhong.cxf.domain.Cat;
import com.guanzhong.cxf.domain.User;


public interface UserService
{
	List<Cat> getCatsByUser(User user);
	Map<String, Cat> getAllCats();
}
