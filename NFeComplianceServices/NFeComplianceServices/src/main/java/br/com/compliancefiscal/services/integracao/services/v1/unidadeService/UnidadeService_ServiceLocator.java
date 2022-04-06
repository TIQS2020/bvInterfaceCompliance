/**
 * UnidadeService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.unidadeService;

public class UnidadeService_ServiceLocator extends org.apache.axis.client.Service implements br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_Service {

    public UnidadeService_ServiceLocator() {
    }


    public UnidadeService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UnidadeService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for unidadeServiceSOAP
    private java.lang.String unidadeServiceSOAP_address;

    public java.lang.String getunidadeServiceSOAPAddress() {
        return unidadeServiceSOAP_address;
    }
    
    public void setUnidadeServiceSOAP_address(java.lang.String unidadeServiceSOAP_address) {
		this.unidadeServiceSOAP_address = unidadeServiceSOAP_address;
	}

	// The WSDD service name defaults to the port name.
    private java.lang.String unidadeServiceSOAPWSDDServiceName = "unidadeServiceSOAP";

    public java.lang.String getunidadeServiceSOAPWSDDServiceName() {
        return unidadeServiceSOAPWSDDServiceName;
    }

    public void setunidadeServiceSOAPWSDDServiceName(java.lang.String name) {
        unidadeServiceSOAPWSDDServiceName = name;
    }

    public br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType getunidadeServiceSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(unidadeServiceSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getunidadeServiceSOAP(endpoint);
    }

    public br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType getunidadeServiceSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeServiceSOAPStub(portAddress, this);
            _stub.setPortName(getunidadeServiceSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setunidadeServiceSOAPEndpointAddress(java.lang.String address) {
        unidadeServiceSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeServiceSOAPStub(new java.net.URL(unidadeServiceSOAP_address), this);
                _stub.setPortName(getunidadeServiceSOAPWSDDServiceName());
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
        if ("unidadeServiceSOAP".equals(inputPortName)) {
            return getunidadeServiceSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/unidadeService", "unidadeService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://services.compliancefiscal.com.br/integracao/services/v1/unidadeService", "unidadeServiceSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("unidadeServiceSOAP".equals(portName)) {
            setunidadeServiceSOAPEndpointAddress(address);
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
