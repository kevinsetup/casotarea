
package pe.edu.upeu.ws;

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
@WebServiceClient(name = "casoDaoImpService", targetNamespace = "http://ws.upeu.edu.pe/", wsdlLocation = "http://localhost:1536/soap/caso?wsdl")
public class CasoDaoImpService
    extends Service
{

    private final static URL CASODAOIMPSERVICE_WSDL_LOCATION;
    private final static WebServiceException CASODAOIMPSERVICE_EXCEPTION;
    private final static QName CASODAOIMPSERVICE_QNAME = new QName("http://ws.upeu.edu.pe/", "casoDaoImpService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:1536/soap/caso?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CASODAOIMPSERVICE_WSDL_LOCATION = url;
        CASODAOIMPSERVICE_EXCEPTION = e;
    }

    public CasoDaoImpService() {
        super(__getWsdlLocation(), CASODAOIMPSERVICE_QNAME);
    }

    public CasoDaoImpService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CASODAOIMPSERVICE_QNAME, features);
    }

    public CasoDaoImpService(URL wsdlLocation) {
        super(wsdlLocation, CASODAOIMPSERVICE_QNAME);
    }

    public CasoDaoImpService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CASODAOIMPSERVICE_QNAME, features);
    }

    public CasoDaoImpService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CasoDaoImpService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CasoDao
     */
    @WebEndpoint(name = "casoDaoImpPort")
    public CasoDao getCasoDaoImpPort() {
        return super.getPort(new QName("http://ws.upeu.edu.pe/", "casoDaoImpPort"), CasoDao.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CasoDao
     */
    @WebEndpoint(name = "casoDaoImpPort")
    public CasoDao getCasoDaoImpPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.upeu.edu.pe/", "casoDaoImpPort"), CasoDao.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CASODAOIMPSERVICE_EXCEPTION!= null) {
            throw CASODAOIMPSERVICE_EXCEPTION;
        }
        return CASODAOIMPSERVICE_WSDL_LOCATION;
    }

}
