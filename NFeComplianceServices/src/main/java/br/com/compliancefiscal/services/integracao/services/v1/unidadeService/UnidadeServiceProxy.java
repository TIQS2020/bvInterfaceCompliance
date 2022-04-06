package br.com.compliancefiscal.services.integracao.services.v1.unidadeService;

public class UnidadeServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType unidadeService_PortType = null;
  
  public UnidadeServiceProxy() {
    _initUnidadeServiceProxy();
  }
  
  public UnidadeServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUnidadeServiceProxy();
  }
  
  private void _initUnidadeServiceProxy() {
    try {
      unidadeService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_ServiceLocator()).getunidadeServiceSOAP();
      if (unidadeService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)unidadeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)unidadeService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (unidadeService_PortType != null)
      ((javax.xml.rpc.Stub)unidadeService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType getUnidadeService_PortType() {
    if (unidadeService_PortType == null)
      _initUnidadeServiceProxy();
    return unidadeService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeResponse cadastrarUnidade(br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeRequest parameters) throws java.rmi.RemoteException{
    if (unidadeService_PortType == null)
      _initUnidadeServiceProxy();
    return unidadeService_PortType.cadastrarUnidade(parameters);
  }
  
  
}