package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService;

public class NfMercantilEmissaoPropServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.NfMercantilEmissaoPropService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.NfMercantilEmissaoPropService_PortType nfMercantilEmissaoPropService_PortType = null;
  
  public NfMercantilEmissaoPropServiceProxy() {
    _initNfMercantilEmissaoPropServiceProxy();
  }
  
  public NfMercantilEmissaoPropServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfMercantilEmissaoPropServiceProxy();
  }
  
  private void _initNfMercantilEmissaoPropServiceProxy() {
    try {
      nfMercantilEmissaoPropService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.NfMercantilEmissaoPropService_ServiceLocator()).getnfMercantilEmissaoPropServiceSOAP();
      if (nfMercantilEmissaoPropService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfMercantilEmissaoPropService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfMercantilEmissaoPropService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfMercantilEmissaoPropService_PortType != null)
      ((javax.xml.rpc.Stub)nfMercantilEmissaoPropService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.NfMercantilEmissaoPropService_PortType getNfMercantilEmissaoPropService_PortType() {
    if (nfMercantilEmissaoPropService_PortType == null)
      _initNfMercantilEmissaoPropServiceProxy();
    return nfMercantilEmissaoPropService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.EmissaoPropNfMercantilResponse emissaoPropNfMercantil(br.com.compliancefiscal.services.integracao.services.v1.nfMercantilEmissaoPropService.EmissaoPropNfMercantilRequest parameters) throws java.rmi.RemoteException{
    if (nfMercantilEmissaoPropService_PortType == null)
      _initNfMercantilEmissaoPropServiceProxy();
    return nfMercantilEmissaoPropService_PortType.emissaoPropNfMercantil(parameters);
  }
  
  
}