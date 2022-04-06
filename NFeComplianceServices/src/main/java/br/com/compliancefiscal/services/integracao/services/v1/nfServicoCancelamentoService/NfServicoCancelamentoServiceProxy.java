package br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService;

public class NfServicoCancelamentoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_PortType nfServicoCancelamentoService_PortType = null;
  
  public NfServicoCancelamentoServiceProxy() {
    _initNfServicoCancelamentoServiceProxy();
  }
  
  public NfServicoCancelamentoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNfServicoCancelamentoServiceProxy();
  }
  
  private void _initNfServicoCancelamentoServiceProxy() {
    try {
      nfServicoCancelamentoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_ServiceLocator()).getnfServicoCancelamentoServiceSOAP();
      if (nfServicoCancelamentoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)nfServicoCancelamentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)nfServicoCancelamentoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (nfServicoCancelamentoService_PortType != null)
      ((javax.xml.rpc.Stub)nfServicoCancelamentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.NfServicoCancelamentoService_PortType getNfServicoCancelamentoService_PortType() {
    if (nfServicoCancelamentoService_PortType == null)
      _initNfServicoCancelamentoServiceProxy();
    return nfServicoCancelamentoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoResponse cancelarNfServico(br.com.compliancefiscal.services.integracao.services.v1.nfServicoCancelamentoService.CancelarNfServicoRequest parameters) throws java.rmi.RemoteException{
    if (nfServicoCancelamentoService_PortType == null)
      _initNfServicoCancelamentoServiceProxy();
    return nfServicoCancelamentoService_PortType.cancelarNfServico(parameters);
  }
  
  
}