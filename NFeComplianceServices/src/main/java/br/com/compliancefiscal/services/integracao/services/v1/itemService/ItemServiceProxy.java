package br.com.compliancefiscal.services.integracao.services.v1.itemService;

public class ItemServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_PortType itemService_PortType = null;
  
  public ItemServiceProxy() {
    _initItemServiceProxy();
  }
  
  public ItemServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initItemServiceProxy();
  }
  
  private void _initItemServiceProxy() {
    try {
      itemService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_ServiceLocator()).getitemServiceSOAP();
      if (itemService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)itemService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)itemService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (itemService_PortType != null)
      ((javax.xml.rpc.Stub)itemService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_PortType getItemService_PortType() {
    if (itemService_PortType == null)
      _initItemServiceProxy();
    return itemService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemResponse cadastrarItem(br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemRequest parameters) throws java.rmi.RemoteException{
    if (itemService_PortType == null)
      _initItemServiceProxy();
    return itemService_PortType.cadastrarItem(parameters);
  }
  
  
}