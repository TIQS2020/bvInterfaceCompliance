package br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService;

public class NfServicoContinuoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_PortType nfServicoContinuoService_PortType = null;
  
  public NfServicoContinuoServiceProxy() {
    _initNfServicoContinuoServiceProxy();
  }
  
  public NfServicoContinuoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfServicoContinuoServiceProxy();
  }
  
  private void _initNfServicoContinuoServiceProxy() {
    try {
      nfServicoContinuoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_ServiceLocator()).getnfServicoContinuoServiceSOAP();
      if (nfServicoContinuoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfServicoContinuoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfServicoContinuoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfServicoContinuoService_PortType != null)
      ((javax.xml.rpc.Stub)nfServicoContinuoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.NfServicoContinuoService_PortType getNfServicoContinuoService_PortType() {
    if (nfServicoContinuoService_PortType == null)
      _initNfServicoContinuoServiceProxy();
    return nfServicoContinuoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoResponse cadastrarNfServico(br.com.compliancefiscal.services.integracao.services.v1.nfServicoContinuoService.CadastrarNfServicoRequest parameters) throws java.rmi.RemoteException{
    if (nfServicoContinuoService_PortType == null)
      _initNfServicoContinuoServiceProxy();
    return nfServicoContinuoService_PortType.cadastrarNfServico(parameters);
  }
  
  
}