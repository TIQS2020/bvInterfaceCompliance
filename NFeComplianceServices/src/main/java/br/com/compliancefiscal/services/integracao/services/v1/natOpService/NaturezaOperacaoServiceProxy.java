package br.com.compliancefiscal.services.integracao.services.v1.natOpService;

public class NaturezaOperacaoServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_PortType naturezaOperacaoService_PortType = null;
  
  public NaturezaOperacaoServiceProxy() {
    _initNaturezaOperacaoServiceProxy();
  }
  
  public NaturezaOperacaoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initNaturezaOperacaoServiceProxy();
  }
  
  private void _initNaturezaOperacaoServiceProxy() {
    try {
      naturezaOperacaoService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_ServiceLocator()).getnaturezaOperacaoServiceSOAP();
      if (naturezaOperacaoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)naturezaOperacaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)naturezaOperacaoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (naturezaOperacaoService_PortType != null)
      ((javax.xml.rpc.Stub)naturezaOperacaoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_PortType getNaturezaOperacaoService_PortType() {
    if (naturezaOperacaoService_PortType == null)
      _initNaturezaOperacaoServiceProxy();
    return naturezaOperacaoService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpResponse cadastrarNaturezaOp(br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpRequest parameters) throws java.rmi.RemoteException{
    if (naturezaOperacaoService_PortType == null)
      _initNaturezaOperacaoServiceProxy();
    return naturezaOperacaoService_PortType.cadastrarNaturezaOp(parameters);
  }
  
  
}