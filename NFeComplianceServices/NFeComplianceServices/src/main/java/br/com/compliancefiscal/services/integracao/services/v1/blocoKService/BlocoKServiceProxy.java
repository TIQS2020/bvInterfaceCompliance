package br.com.compliancefiscal.services.integracao.services.v1.blocoKService;

public class BlocoKServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.blocoKService.BlocoKService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.blocoKService.BlocoKService_PortType blocoKService_PortType = null;
  
  public BlocoKServiceProxy() {
    _initBlocoKServiceProxy();
  }
  
  public BlocoKServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBlocoKServiceProxy();
  }
  
  private void _initBlocoKServiceProxy() {
    try {
      blocoKService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.blocoKService.BlocoKService_ServiceLocator()).getblocoKServiceSOAP();
      if (blocoKService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)blocoKService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)blocoKService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (blocoKService_PortType != null)
      ((javax.xml.rpc.Stub)blocoKService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.blocoKService.BlocoKService_PortType getBlocoKService_PortType() {
    if (blocoKService_PortType == null)
      _initBlocoKServiceProxy();
    return blocoKService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.blocoKService.CadastrarBlocoKResponse cadastrarBlocoK(br.com.compliancefiscal.services.integracao.services.v1.blocoKService.CadastrarBlocoKRequest parameters) throws java.rmi.RemoteException{
    if (blocoKService_PortType == null)
      _initBlocoKServiceProxy();
    return blocoKService_PortType.cadastrarBlocoK(parameters);
  }
  
  
}