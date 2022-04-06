package br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService_;

public class ConsultaGenericaServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType consultaGenericaService_PortType = null;
  
  public ConsultaGenericaServiceProxy() {
    _initConsultaGenericaServiceProxy();
  }
  
  public ConsultaGenericaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaGenericaServiceProxy();
  }
  
  private void _initConsultaGenericaServiceProxy() {
    try {
      consultaGenericaService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_ServiceLocator()).getconsultaGenericaServiceSOAP();
      if (consultaGenericaService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaGenericaService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaGenericaService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaGenericaService_PortType != null)
      ((javax.xml.rpc.Stub)consultaGenericaService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultaGenericaService_PortType getConsultaGenericaService_PortType() {
    if (consultaGenericaService_PortType == null)
      _initConsultaGenericaServiceProxy();
    return consultaGenericaService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteResponse consultarLote(br.com.compliancefiscal.services.integracao.services.v1.consultaGenericaService.ConsultarLoteRequest parameters) throws java.rmi.RemoteException{
    if (consultaGenericaService_PortType == null)
      _initConsultaGenericaServiceProxy();
    return consultaGenericaService_PortType.consultarLote(parameters);
  }
  
  
}