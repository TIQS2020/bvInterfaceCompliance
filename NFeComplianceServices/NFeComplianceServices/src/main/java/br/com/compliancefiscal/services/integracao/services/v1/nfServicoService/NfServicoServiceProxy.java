package br.com.compliancefiscal.services.integracao.services.v1.nfServicoService;

public class NfServicoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_PortType nfServicoService_PortType = null;
  
  public NfServicoServiceProxy() {
    _initNfServicoServiceProxy();
  }
  
  public NfServicoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfServicoServiceProxy();
  }
  
  private void _initNfServicoServiceProxy() {
    try {
      nfServicoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_ServiceLocator()).getnfServicoServiceSOAP();
      if (nfServicoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfServicoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfServicoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfServicoService_PortType != null)
      ((javax.xml.rpc.Stub)nfServicoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.NfServicoService_PortType getNfServicoService_PortType() {
    if (nfServicoService_PortType == null)
      _initNfServicoServiceProxy();
    return nfServicoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.CadastroNotaServicoResponse cadastroNotaServico(br.com.compliancefiscal.services.integracao.services.v1.nfServicoService.CadastroNotaServicoRequest parameters) throws java.rmi.RemoteException{
    if (nfServicoService_PortType == null)
      _initNfServicoServiceProxy();
    return nfServicoService_PortType.cadastroNotaServico(parameters);
  }
  
  
}