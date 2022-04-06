package br.com.compliancefiscal.services.integracao.services.v1.participanteService;

public class ParticipanteServiceProxy implements br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType {
  private String _endpoint = null;
  private br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType participanteService_PortType = null;
  
  public ParticipanteServiceProxy() {
    _initParticipanteServiceProxy();
  }
  
  public ParticipanteServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initParticipanteServiceProxy();
  }
  
  private void _initParticipanteServiceProxy() {
    try {
      participanteService_PortType = (new br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_ServiceLocator()).getparticipanteServiceSOAP();
      if (participanteService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)participanteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)participanteService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (participanteService_PortType != null)
      ((javax.xml.rpc.Stub)participanteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType getParticipanteService_PortType() {
    if (participanteService_PortType == null)
      _initParticipanteServiceProxy();
    return participanteService_PortType;
  }
  
  public br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteResponse cadastrarParticipante(br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteRequest parameters) throws java.rmi.RemoteException{
    if (participanteService_PortType == null)
      _initParticipanteServiceProxy();
    return participanteService_PortType.cadastrarParticipante(parameters);
  }
  
  
}