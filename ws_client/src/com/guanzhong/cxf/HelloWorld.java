package com.guanzhong.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2015-01-26T14:35:44.560-05:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "http://cxf.guanzhong.com/", name = "HelloWorld")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWorld {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getCatsByUser", targetNamespace = "http://cxf.guanzhong.com/", className = "com.guanzhong.cxf.GetCatsByUser")
    @WebMethod
    @ResponseWrapper(localName = "getCatsByUserResponse", targetNamespace = "http://cxf.guanzhong.com/", className = "com.guanzhong.cxf.GetCatsByUserResponse")
    public java.util.List<com.guanzhong.cxf.Cat> getCatsByUser(
        @WebParam(name = "arg0", targetNamespace = "")
        com.guanzhong.cxf.User arg0
    );

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllCats", targetNamespace = "http://cxf.guanzhong.com/", className = "com.guanzhong.cxf.GetAllCats")
    @WebMethod
    @ResponseWrapper(localName = "getAllCatsResponse", targetNamespace = "http://cxf.guanzhong.com/", className = "com.guanzhong.cxf.GetAllCatsResponse")
    public com.guanzhong.cxf.CatMapEntry getAllCats();
}
