package br.com.compliancefiscal.services.integracao.services.v1.inventarioService;

public class InventarioServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.inventarioService.InventarioService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.inventarioService.InventarioService_PortType inventarioService_PortType = null;
  
  public InventarioServiceProxy() {
    _initInventarioServiceProxy();
  }
  
  public InventarioServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initInventarioServiceProxy();
  }
  
  private void _initInventarioServiceProxy() {
    try {
      inventarioService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.inventarioService.InventarioService_ServiceLocator()).getinventarioServiceSOAP();
      if (inventarioService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)inventarioService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)inventarioService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (inventarioService_PortType != null)
      ((javax.xml.rpc.Stub)inventarioService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.inventarioService.InventarioService_PortType getInventarioService_PortType() {
    if (inventarioService_PortType == null)
      _initInventarioServiceProxy();
    return inventarioService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.inventarioService.CadastrarInventarioResponse cadastrarInventario(br.com.compliancefiscal.services.integracao.services.v1.inventarioService.CadastrarInventarioRequest parameters) throws java.rmi.RemoteException{
    if (inventarioService_PortType == null)
      _initInventarioServiceProxy();
    return inventarioService_PortType.cadastrarInventario(parameters);
  }
  
  
}