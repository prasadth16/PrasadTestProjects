
package com.thakur.dattaprasad.webserviceclient.com.bharath.ws.trainings;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.bharath.ws.trainings package. 
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

    private final static QName _Getordersresponce_QNAME = new QName("http://trainings.ws.bharath.com/", "getordersresponce");
    private final static QName _CreateOrdersResponse_QNAME = new QName("http://trainings.ws.bharath.com/", "createOrdersResponse");
    private final static QName _CreateOrdersrequest_QNAME = new QName("http://trainings.ws.bharath.com/", "createOrdersrequest");
    private final static QName _GetOrdersRequest_QNAME = new QName("http://trainings.ws.bharath.com/", "getOrdersRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.bharath.ws.trainings
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Getordersresponce }
     * 
     */
    public Getordersresponce createGetordersresponce() {
        return new Getordersresponce();
    }

    /**
     * Create an instance of {@link CreateOrdersreq }
     * 
     */
    public CreateOrdersreq createCreateOrdersreq() {
        return new CreateOrdersreq();
    }

    /**
     * Create an instance of {@link Createordersres }
     * 
     */
    public Createordersres createCreateordersres() {
        return new Createordersres();
    }

    /**
     * Create an instance of {@link GetOrdersreq }
     * 
     */
    public GetOrdersreq createGetOrdersreq() {
        return new GetOrdersreq();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link Order }
     * 
     */
    public Order createOrder() {
        return new Order();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Getordersresponce }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.bharath.com/", name = "getordersresponce")
    public JAXBElement<Getordersresponce> createGetordersresponce(Getordersresponce value) {
        return new JAXBElement<Getordersresponce>(_Getordersresponce_QNAME, Getordersresponce.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Createordersres }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.bharath.com/", name = "createOrdersResponse")
    public JAXBElement<Createordersres> createCreateOrdersResponse(Createordersres value) {
        return new JAXBElement<Createordersres>(_CreateOrdersResponse_QNAME, Createordersres.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrdersreq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.bharath.com/", name = "createOrdersrequest")
    public JAXBElement<CreateOrdersreq> createCreateOrdersrequest(CreateOrdersreq value) {
        return new JAXBElement<CreateOrdersreq>(_CreateOrdersrequest_QNAME, CreateOrdersreq.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrdersreq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://trainings.ws.bharath.com/", name = "getOrdersRequest")
    public JAXBElement<GetOrdersreq> createGetOrdersRequest(GetOrdersreq value) {
        return new JAXBElement<GetOrdersreq>(_GetOrdersRequest_QNAME, GetOrdersreq.class, null, value);
    }

}
