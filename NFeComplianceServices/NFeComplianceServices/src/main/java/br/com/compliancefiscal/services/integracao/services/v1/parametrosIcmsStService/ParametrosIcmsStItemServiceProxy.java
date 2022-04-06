package br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService;

public class ParametrosIcmsStItemServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.ParametrosIcmsStItemService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.ParametrosIcmsStItemService_PortType parametrosIcmsStItemService_PortType = null;
  
  public ParametrosIcmsStItemServiceProxy() {
    _initParametrosIcmsStItemServiceProxy();
  }
  
  public ParametrosIcmsStItemServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initParametrosIcmsStItemServiceProxy();
  }
  
  private void _initParametrosIcmsStItemServiceProxy() {
    try {
      parametrosIcmsStItemService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.ParametrosIcmsStItemService_ServiceLocator()).getparametrosIcmsStItemServiceSOAP();
      if (parametrosIcmsStItemService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)parametrosIcmsStItemService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)parametrosIcmsStItemService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (parametrosIcmsStItemService_PortType != null)
      ((javax.xml.rpc.Stub)parametrosIcmsStItemService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.ParametrosIcmsStItemService_PortType getParametrosIcmsStItemService_PortType() {
    if (parametrosIcmsStItemService_PortType == null)
      _initParametrosIcmsStItemServiceProxy();
    return parametrosIcmsStItemService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.CadastrarIcmsStResponse cadastrarIcmsSt(br.com.compliancefiscal.services.integracao.services.v1.parametrosIcmsStService.CadastrarIcmsStRequest parameters) throws java.rmi.RemoteException{
    if (parametrosIcmsStItemService_PortType == null)
      _initParametrosIcmsStItemServiceProxy();
    return parametrosIcmsStItemService_PortType.cadastrarIcmsSt(parameters);
  }
  
  
}