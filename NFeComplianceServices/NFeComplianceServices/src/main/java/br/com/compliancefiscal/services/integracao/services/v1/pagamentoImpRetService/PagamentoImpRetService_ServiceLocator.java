/**
 * PagamentoImpRetService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService;

public class PagamentoImpRetService_ServiceLocator extends org.apache.axis.client.Service implements br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_Service {

    public PagamentoImpRetService_ServiceLocator() {
    }


    public PagamentoImpRetService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PagamentoImpRetService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for pagamentoImpRetServiceSOAP
    private java.lang.String pagamentoImpRetServiceSOAP_address;

    public java.lang.String getpagamentoImpRetServiceSOAPAddress() {
        return pagamentoImpRetServiceSOAP_address;
    }
    
    

    public void setPagamentoImpRetServiceSOAP_address(java.lang.String pagamentoImpRetServiceSOAP_address) {
		this.pagamentoImpRetServiceSOAP_address = pagamentoImpRetServiceSOAP_address;
	}

	// The WSDD service name defaults to the port name.
    private java.lang.String pagamentoImpRetServiceSOAPWSDDServiceName = "pagamentoImpRetServiceSOAP";

    public java.lang.String getpagamentoImpRetServiceSOAPWSDDServiceName() {
        return pagamentoImpRetServiceSOAPWSDDServiceName;
    }

    public void setpagamentoImpRetServiceSOAPWSDDServiceName(java.lang.String name) {
        pagamentoImpRetServiceSOAPWSDDServiceName = name;
    }

    public br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType getpagamentoImpRetServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(pagamentoImpRetServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpagamentoImpRetServiceSOAP(endpoint);
    }

    public br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType getpagamentoImpRetServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetServiceSOAPStub(portAddress, this);
            _stub.setPortName(getpagamentoImpRetServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpagamentoImpRetServiceSOAPEndpointAddress(java.lang.String address) {
        pagamentoImpRetServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetServiceSOAPStub(new java.net.URL(pagamentoImpRetServiceSOAP_address), this);
                _stub.setPortName(getpagamentoImpRetServiceSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("pagamentoImpRetServiceSOAP".equals(inputPortName)) {
            return getpagamentoImpRetServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/pagamentoImpRetService", "pagamentoImpRetService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/pagamentoImpRetService", "pagamentoImpRetServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("pagamentoImpRetServiceSOAP".equals(portName)) {
            setpagamentoImpRetServiceSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
