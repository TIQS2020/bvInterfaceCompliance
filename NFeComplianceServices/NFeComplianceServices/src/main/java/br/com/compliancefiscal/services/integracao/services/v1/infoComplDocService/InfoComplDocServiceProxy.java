package br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService;

public class InfoComplDocServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.InfoComplDocService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.InfoComplDocService_PortType infoComplDocService_PortType = null;
  
  public InfoComplDocServiceProxy() {
    _initInfoComplDocServiceProxy();
  }
  
  public InfoComplDocServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfoComplDocServiceProxy();
  }
  
  private void _initInfoComplDocServiceProxy() {
    try {
      infoComplDocService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.InfoComplDocService_ServiceLocator()).getinfoComplDocServiceSOAP();
      if (infoComplDocService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infoComplDocService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infoComplDocService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infoComplDocService_PortType != null)
      ((javax.xml.rpc.Stub)infoComplDocService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.InfoComplDocService_PortType getInfoComplDocService_PortType() {
    if (infoComplDocService_PortType == null)
      _initInfoComplDocServiceProxy();
    return infoComplDocService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.CadastrarInfoComplDocResponse cadastrarInfoComplDoc(br.com.compliancefiscal.services.integracao.services.v1.infoComplDocService.CadastrarInfoComplDocRequest parameters) throws java.rmi.RemoteException{
    if (infoComplDocService_PortType == null)
      _initInfoComplDocServiceProxy();
    return infoComplDocService_PortType.cadastrarInfoComplDoc(parameters);
  }
  
  
}