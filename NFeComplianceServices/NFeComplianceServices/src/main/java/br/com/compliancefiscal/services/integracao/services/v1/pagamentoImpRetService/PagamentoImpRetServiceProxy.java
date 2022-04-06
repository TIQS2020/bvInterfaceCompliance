package br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService;

public class PagamentoImpRetServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType pagamentoImpRetService_PortType = null;
  
  public PagamentoImpRetServiceProxy() {
    _initPagamentoImpRetServiceProxy();
  }
  
  public PagamentoImpRetServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initPagamentoImpRetServiceProxy();
  }
  
  private void _initPagamentoImpRetServiceProxy() {
    try {
      pagamentoImpRetService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_ServiceLocator()).getpagamentoImpRetServiceSOAP();
      if (pagamentoImpRetService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pagamentoImpRetService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pagamentoImpRetService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pagamentoImpRetService_PortType != null)
      ((javax.xml.rpc.Stub)pagamentoImpRetService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.PagamentoImpRetService_PortType getPagamentoImpRetService_PortType() {
    if (pagamentoImpRetService_PortType == null)
      _initPagamentoImpRetServiceProxy();
    return pagamentoImpRetService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.CadastrarPgtoImpRetResponse cadastrarPgtoImpRet(br.com.compliancefiscal.services.integracao.services.v1.pagamentoImpRetService.CadastrarPgtoImpRetRequest parameters) throws java.rmi.RemoteException{
    if (pagamentoImpRetService_PortType == null)
      _initPagamentoImpRetServiceProxy();
    return pagamentoImpRetService_PortType.cadastrarPgtoImpRet(parameters);
  }
  
  
}