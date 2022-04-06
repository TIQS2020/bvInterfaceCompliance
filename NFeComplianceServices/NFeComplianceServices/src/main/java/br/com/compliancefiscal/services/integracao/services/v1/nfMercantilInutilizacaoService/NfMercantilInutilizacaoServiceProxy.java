package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService;

public class NfMercantilInutilizacaoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.NfMercantilInutilizacaoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.NfMercantilInutilizacaoService_PortType nfMercantilInutilizacaoService_PortType = null;
  
  public NfMercantilInutilizacaoServiceProxy() {
    _initNfMercantilInutilizacaoServiceProxy();
  }
  
  public NfMercantilInutilizacaoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfMercantilInutilizacaoServiceProxy();
  }
  
  private void _initNfMercantilInutilizacaoServiceProxy() {
    try {
      nfMercantilInutilizacaoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.NfMercantilInutilizacaoService_ServiceLocator()).getnfMercantilInutilizacaoServiceSOAP();
      if (nfMercantilInutilizacaoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfMercantilInutilizacaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfMercantilInutilizacaoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfMercantilInutilizacaoService_PortType != null)
      ((javax.xml.rpc.Stub)nfMercantilInutilizacaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.NfMercantilInutilizacaoService_PortType getNfMercantilInutilizacaoService_PortType() {
    if (nfMercantilInutilizacaoService_PortType == null)
      _initNfMercantilInutilizacaoServiceProxy();
    return nfMercantilInutilizacaoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.InutilizarNfMercantilResponse inutilizarNfMercantil(br.com.compliancefiscal.services.integracao.services.v1.nfMercantilInutilizacaoService.InutilizarNfMercantilRequest parameters) throws java.rmi.RemoteException{
    if (nfMercantilInutilizacaoService_PortType == null)
      _initNfMercantilInutilizacaoServiceProxy();
    return nfMercantilInutilizacaoService_PortType.inutilizarNfMercantil(parameters);
  }
  
  
}