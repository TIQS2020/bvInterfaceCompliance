package br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService;

public class NfServicoEmissaoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType nfServicoEmissaoService_PortType = null;
  
  public NfServicoEmissaoServiceProxy() {
    _initNfServicoEmissaoServiceProxy();
  }
  
  public NfServicoEmissaoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfServicoEmissaoServiceProxy();
  }
  
  private void _initNfServicoEmissaoServiceProxy() {
    try {
      nfServicoEmissaoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_ServiceLocator()).getnfServicoEmissaoServiceSOAP();
      if (nfServicoEmissaoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfServicoEmissaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfServicoEmissaoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfServicoEmissaoService_PortType != null)
      ((javax.xml.rpc.Stub)nfServicoEmissaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType getNfServicoEmissaoService_PortType() {
    if (nfServicoEmissaoService_PortType == null)
      _initNfServicoEmissaoServiceProxy();
    return nfServicoEmissaoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoResponse emissaoTercNfServico(br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoRequest parameters) throws java.rmi.RemoteException{
    if (nfServicoEmissaoService_PortType == null)
      _initNfServicoEmissaoServiceProxy();
    return nfServicoEmissaoService_PortType.emissaoTercNfServico(parameters);
  }
  
  
}