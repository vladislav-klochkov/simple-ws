
package ws_generated.productCatalog;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ProductCatalogService", targetNamespace = "http://sellmegood.com", wsdlLocation = "http://vladislav-laptop:8080/sell_me_good_war_exploded/ProductCatalogService?wsdl")
public class ProductCatalogService
    extends Service
{

    private final static URL PRODUCTCATALOGSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTCATALOGSERVICE_EXCEPTION;
    private final static QName PRODUCTCATALOGSERVICE_QNAME = new QName("http://sellmegood.com", "ProductCatalogService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://vladislav-laptop:8080/sell_me_good_war_exploded/ProductCatalogService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTCATALOGSERVICE_WSDL_LOCATION = url;
        PRODUCTCATALOGSERVICE_EXCEPTION = e;
    }

    public ProductCatalogService() {
        super(__getWsdlLocation(), PRODUCTCATALOGSERVICE_QNAME);
    }

    public ProductCatalogService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTCATALOGSERVICE_QNAME, features);
    }

    public ProductCatalogService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTCATALOGSERVICE_QNAME);
    }

    public ProductCatalogService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTCATALOGSERVICE_QNAME, features);
    }

    public ProductCatalogService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductCatalogService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductCatalogImpl
     */
    @WebEndpoint(name = "ProductCatalogPort")
    public ProductCatalogImpl getProductCatalogPort() {
        return super.getPort(new QName("http://sellmegood.com", "ProductCatalogPort"), ProductCatalogImpl.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductCatalogImpl
     */
    @WebEndpoint(name = "ProductCatalogPort")
    public ProductCatalogImpl getProductCatalogPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://sellmegood.com", "ProductCatalogPort"), ProductCatalogImpl.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTCATALOGSERVICE_EXCEPTION!= null) {
            throw PRODUCTCATALOGSERVICE_EXCEPTION;
        }
        return PRODUCTCATALOGSERVICE_WSDL_LOCATION;
    }

}