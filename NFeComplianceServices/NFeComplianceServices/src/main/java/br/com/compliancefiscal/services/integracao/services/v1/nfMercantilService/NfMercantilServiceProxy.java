package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService;

public class NfMercantilServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_PortType nfMercantilService_PortType = null;
  
  public NfMercantilServiceProxy() {
    _initNfMercantilServiceProxy();
  }
  
  public NfMercantilServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfMercantilServiceProxy();
  }
  
  private void _initNfMercantilServiceProxy() {
    try {
      nfMercantilService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_ServiceLocator()).getnfMercantilServiceSOAP();
      if (nfMercantilService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfMercantilService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfMercantilService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfMercantilService_PortType != null)
      ((javax.xml.rpc.Stub)nfMercantilService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.NfMercantilService_PortType getNfMercantilService_PortType() {
    if (nfMercantilService_PortType == null)
      _initNfMercantilServiceProxy();
    return nfMercantilService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.CadastrarNfMercantilResponse cadastrarNfMercantil(br.com.compliancefiscal.services.integracao.services.v1.nfMercantilService.CadastrarNfMercantilRequest parameters) throws java.rmi.RemoteException{
    if (nfMercantilService_PortType == null)
      _initNfMercantilServiceProxy();
    return nfMercantilService_PortType.cadastrarNfMercantil(parameters);
  }
  
  
}