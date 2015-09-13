package com.guanzhong.cxf;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.guanzhong.cxf.adapter.CatXMLAdapter;
import com.guanzhong.cxf.domain.Cat;
import com.guanzhong.cxf.domain.User;


@WebService()
public interface HelloWorld
{
	
	List<Cat> getCatsByUser(User user);
	@XmlJavaTypeAdapter(CatXMLAdapter.class) Map<String, Cat> getAllCats();
	

}
