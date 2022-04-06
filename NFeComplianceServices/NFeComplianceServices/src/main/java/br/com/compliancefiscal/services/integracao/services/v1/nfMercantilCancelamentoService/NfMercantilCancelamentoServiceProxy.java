package br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService;

public class NfMercantilCancelamentoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.NfMercantilCancelamentoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.NfMercantilCancelamentoService_PortType nfMercantilCancelamentoService_PortType = null;
  
  public NfMercantilCancelamentoServiceProxy() {
    _initNfMercantilCancelamentoServiceProxy();
  }
  
  public NfMercantilCancelamentoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfMercantilCancelamentoServiceProxy();
  }
  
  private void _initNfMercantilCancelamentoServiceProxy() {
    try {
      nfMercantilCancelamentoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.NfMercantilCancelamentoService_ServiceLocator()).getnfMercantilCancelamentoServiceSOAP();
      if (nfMercantilCancelamentoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfMercantilCancelamentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfMercantilCancelamentoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfMercantilCancelamentoService_PortType != null)
      ((javax.xml.rpc.Stub)nfMercantilCancelamentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.NfMercantilCancelamentoService_PortType getNfMercantilCancelamentoService_PortType() {
    if (nfMercantilCancelamentoService_PortType == null)
      _initNfMercantilCancelamentoServiceProxy();
    return nfMercantilCancelamentoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.EnviarNfMercCancelResponse enviarNfMercCancel(br.com.compliancefiscal.services.integracao.services.v1.nfMercantilCancelamentoService.EnviarNfMercCancelRequest parameters) throws java.rmi.RemoteException{
    if (nfMercantilCancelamentoService_PortType == null)
      _initNfMercantilCancelamentoServiceProxy();
    return nfMercantilCancelamentoService_PortType.enviarNfMercCancel(parameters);
  }
  
  
}