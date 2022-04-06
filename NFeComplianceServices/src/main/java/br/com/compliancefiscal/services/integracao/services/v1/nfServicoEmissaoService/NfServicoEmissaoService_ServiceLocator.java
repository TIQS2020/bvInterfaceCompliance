/**
 * NfServicoEmissaoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService;

public class NfServicoEmissaoService_ServiceLocator extends org.apache.axis.client.Service implements
		br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_Service {

	public NfServicoEmissaoService_ServiceLocator() {
	}

	public NfServicoEmissaoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
		super(config);
	}

	public NfServicoEmissaoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName)
			throws javax.xml.rpc.ServiceException {
		super(wsdlLoc, sName);
	}

	// Use to get a proxy class for nfServicoEmissaoServiceSOAP
	private java.lang.String nfServicoEmissaoServiceSOAP_address = "https://wshml.compliancefiscal.com.br:443/ComplianceService/nfServicoEmissaoService";

	public java.lang.String getnfServicoEmissaoServiceSOAPAddress() {
		return nfServicoEmissaoServiceSOAP_address;
	}

	public void setNfServicoEmissaoServiceSOAP_address(java.lang.String nfServicoEmissaoServiceSOAP_address) {
		this.nfServicoEmissaoServiceSOAP_address = nfServicoEmissaoServiceSOAP_address;
	}

	// The WSDD service name defaults to the port name.
	private java.lang.String nfServicoEmissaoServiceSOAPWSDDServiceName = "nfServicoEmissaoServiceSOAP";

	public java.lang.String getnfServicoEmissaoServiceSOAPWSDDServiceName() {
		return nfServicoEmissaoServiceSOAPWSDDServiceName;
	}

	public void setnfServicoEmissaoServiceSOAPWSDDServiceName(java.lang.String name) {
		nfServicoEmissaoServiceSOAPWSDDServiceName = name;
	}

	public br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType getnfServicoEmissaoServiceSOAP()
			throws javax.xml.rpc.ServiceException {
		java.net.URL endpoint;
		try {
			endpoint = new java.net.URL(nfServicoEmissaoServiceSOAP_address);
		} catch (java.net.MalformedURLException e) {
			throw new javax.xml.rpc.ServiceException(e);
		}
		return getnfServicoEmissaoServiceSOAP(endpoint);
	}

	public br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType getnfServicoEmissaoServiceSOAP(
			java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
		try {
			br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoServiceSOAPStub(
					portAddress, this);
			_stub.setPortName(getnfServicoEmissaoServiceSOAPWSDDServiceName());
			return _stub;
		} catch (org.apache.axis.AxisFault e) {
			return null;
		}
	}

	public void setnfServicoEmissaoServiceSOAPEndpointAddress(java.lang.String address) {
		nfServicoEmissaoServiceSOAP_address = address;
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
		try {
			if (br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType.class
					.isAssignableFrom(serviceEndpointInterface)) {
				br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoServiceSOAPStub _stub = new br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoServiceSOAPStub(
						new java.net.URL(nfServicoEmissaoServiceSOAP_address), this);
				_stub.setPortName(getnfServicoEmissaoServiceSOAPWSDDServiceName());
				return _stub;
			}
		} catch (java.lang.Throwable t) {
			throw new javax.xml.rpc.ServiceException(t);
		}
		throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  "
				+ (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
	}

	/**
	 * For the given interface, get the stub implementation. If this service has no
	 * port for the given interface, then ServiceException is thrown.
	 */
	public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface)
			throws javax.xml.rpc.ServiceException {
		if (portName == null) {
			return getPort(serviceEndpointInterface);
		}
		java.lang.String inputPortName = portName.getLocalPart();
		if ("nfServicoEmissaoServiceSOAP".equals(inputPortName)) {
			return getnfServicoEmissaoServiceSOAP();
		} else {
			java.rmi.Remote _stub = getPort(serviceEndpointInterface);
			((org.apache.axis.client.Stub) _stub).setPortName(portName);
			return _stub;
		}
	}

	public javax.xml.namespace.QName getServiceName() {
		return new javax.xml.namespace.QName(
				"http://services.compliancefiscal.com.br/integracao/services/v1/nfServicoEmissaoService",
				"nfServicoEmissaoService");
	}

	private java.util.HashSet ports = null;

	public java.util.Iterator getPorts() {
		if (ports == null) {
			ports = new java.util.HashSet();
			ports.add(new javax.xml.namespace.QName(
					"http://services.compliancefiscal.com.br/integracao/services/v1/nfServicoEmissaoService",
					"nfServicoEmissaoServiceSOAP"));
		}
		return ports.iterator();
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(java.lang.String portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {

		if ("nfServicoEmissaoServiceSOAP".equals(portName)) {
			setnfServicoEmissaoServiceSOAPEndpointAddress(address);
		} else { // Unknown Port Name
			throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
		}
	}

	/**
	 * Set the endpoint address for the specified port name.
	 */
	public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address)
			throws javax.xml.rpc.ServiceException {
		setEndpointAddress(portName.getLocalPart(), address);
	}

}
