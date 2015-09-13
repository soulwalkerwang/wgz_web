
package com.guanzhong.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.guanzhong.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCatsByUserResponse_QNAME = new QName("http://cxf.guanzhong.com/", "getCatsByUserResponse");
    private final static QName _GetAllCats_QNAME = new QName("http://cxf.guanzhong.com/", "getAllCats");
    private final static QName _GetAllCatsResponse_QNAME = new QName("http://cxf.guanzhong.com/", "getAllCatsResponse");
    private final static QName _GetCatsByUser_QNAME = new QName("http://cxf.guanzhong.com/", "getCatsByUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.guanzhong.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllCatsResponse }
     * 
     */
    public GetAllCatsResponse createGetAllCatsResponse() {
        return new GetAllCatsResponse();
    }

    /**
     * Create an instance of {@link GetAllCats }
     * 
     */
    public GetAllCats createGetAllCats() {
        return new GetAllCats();
    }

    /**
     * Create an instance of {@link GetCatsByUserResponse }
     * 
     */
    public GetCatsByUserResponse createGetCatsByUserResponse() {
        return new GetCatsByUserResponse();
    }

    /**
     * Create an instance of {@link GetCatsByUser }
     * 
     */
    public GetCatsByUser createGetCatsByUser() {
        return new GetCatsByUser();
    }

    /**
     * Create an instance of {@link CatMapEntry }
     * 
     */
    public CatMapEntry createCatMapEntry() {
        return new CatMapEntry();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.guanzhong.com/", name = "getCatsByUserResponse")
    public JAXBElement<GetCatsByUserResponse> createGetCatsByUserResponse(GetCatsByUserResponse value) {
        return new JAXBElement<GetCatsByUserResponse>(_GetCatsByUserResponse_QNAME, GetCatsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCats }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.guanzhong.com/", name = "getAllCats")
    public JAXBElement<GetAllCats> createGetAllCats(GetAllCats value) {
        return new JAXBElement<GetAllCats>(_GetAllCats_QNAME, GetAllCats.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllCatsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.guanzhong.com/", name = "getAllCatsResponse")
    public JAXBElement<GetAllCatsResponse> createGetAllCatsResponse(GetAllCatsResponse value) {
        return new JAXBElement<GetAllCatsResponse>(_GetAllCatsResponse_QNAME, GetAllCatsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.guanzhong.com/", name = "getCatsByUser")
    public JAXBElement<GetCatsByUser> createGetCatsByUser(GetCatsByUser value) {
        return new JAXBElement<GetCatsByUser>(_GetCatsByUser_QNAME, GetCatsByUser.class, null, value);
    }

}
