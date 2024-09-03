package br.com.bv.nfe.controle;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.xml.rpc.ServiceException;

import br.com.bv.vo.CaminhosVO;
import br.com.compliance.nfe.jde.domain.F55IJC02;
import br.com.compliance.nfe.jde.domain.F55IJC02Id;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import br.com.bv.nfe.vo.Item.ItemVO;
import br.com.bv.nfe.vo.naturezaOperacao.NaturezaOperacaoVO;
import br.com.bv.nfe.vo.nfServico.NfServicoVO;
import br.com.bv.nfe.vo.participante.ParticipanteVO;
import br.com.bv.nfe.vo.unidade.UnidadeVO;
import br.com.bv.vo.CpfCnpjVO;
import br.com.bv.vo.EnvioVO;
import br.com.bv.vo.ServicesVO;
import br.com.compliance.nfe.dao.F55IJC80Dao;
import br.com.compliance.nfe.dao.F55IJC81Dao;
import br.com.compliance.nfe.dao.F55IJC83Dao;
import br.com.compliance.nfe.dao.F55IJC84Dao;
import br.com.compliance.nfe.jde.domain.F55IJC80;
import br.com.compliance.nfe.jde.domain.F55IJC80Id;
import br.com.compliance.nfe.jde.domain.F55IJC81;
import br.com.compliance.nfe.jde.domain.F55IJC81Id;
import br.com.compliance.nfe.jde.domain.F55IJC83;
import br.com.compliance.nfe.jde.domain.F55IJC83Id;
import br.com.compliance.nfe.jde.domain.F55IJC84;
import br.com.compliance.nfe.jde.domain.F55IJC84Id;
import br.com.compliance.nfe.jpa.EntityManagerHelper;
import br.com.compliance.nfe.util.DateUtil;
import br.com.compliance.nfe.util.ExceptionHelper;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.item.Item;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.naturezaOperacao.NaturezaOperacao;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.nfServicos.NfServicos;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.participante.Participante;
import br.com.compliancefiscal.modelo.integracao.domain.cadastros.v1.unidade.Unidade;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.LoteIntWSResponse;
import br.com.compliancefiscal.modelo.integracao.domain.v1.tiposGenericos.MultOrgAuthentication;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemRequest;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.CadastrarItemResponse;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.itemService.ItemService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpRequest;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.CadastrarNaturezaOpResponse;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.natOpService.NaturezaOperacaoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoRequest;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.EmissaoTercNfServicoResponse;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.nfServicoEmissaoService.NfServicoEmissaoService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteRequest;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.CadastrarParticipanteResponse;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.participanteService.ParticipanteService_ServiceLocator;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeRequest;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.CadastrarUnidadeResponse;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_PortType;
import br.com.compliancefiscal.services.integracao.services.v1.unidadeService.UnidadeService_ServiceLocator;
import br.com.nfe.control.XmlFileControl;
import br.com.nfe.util.Operacao;
import br.com.nfe.vo.ArquivoVo;
import br.com.nfe.xml.cancelamento.XmlFileCancelamentoRoot;
import br.com.nfe.xml.envio.XmlFileEnvioRoot;
import br.com.nfe.xml.envio.vo.F55IJC81Item;
import br.com.nfe.xml.envio.vo.F55IJC83Item;
import br.com.nfe.xml.envio.vo.F55IJC84Item;

public class EnvioControle {

	MultOrgAuthentication autenticacao = null;
	EnvioVO envioVO = null;
	CpfCnpjVO cpfCnpjVO = null;
	private static final String[] STATUS_EMISSAO = {"1"};
	private String loteEnvio;
	private static final Logger log = LogManager.getLogger(EnvioControle.class.getName());
	private List<F55IJC80> listF55IJC80;
	private ServicesVO servicesVO;
	private F55IJC80Dao f55IJC80Dao = new F55IJC80Dao();
	private F55IJC81Dao f55IJC81Dao = new F55IJC81Dao();	
	private F55IJC83Dao f55IJC83Dao = new F55IJC83Dao();
	private F55IJC84Dao f55IJC84Dao = new F55IJC84Dao();
		

	public EnvioControle() {
	}

	public void inicializaProcesso(ServicesVO services, CaminhosVO caminhosVO) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy as HH:mm:ss");		

		try {
			log.info("## INICIANDO PROCESSO DE EMISSAO - "+dateFormat+" ##");
			log.info("++ VERIFICANDO PASTA DE ARQUIVOS ++");
			
			XmlFileEnvioRoot xmlEnvioRoot = new XmlFileEnvioRoot();
			Operacao<XmlFileEnvioRoot, XmlFileCancelamentoRoot> operacao = new Operacao<>(xmlEnvioRoot, null);

			XmlFileControl xmlFileControl = new XmlFileControl();
			List<ArquivoVo> arquivoVoList = xmlFileControl.xmlTransformToObject(operacao);			
			
			servicesVO = services;
			
			/*TODO: revisar*/
			if(arquivoVoList.size() > 0) {
				
				for(ArquivoVo arquivoVo : arquivoVoList) {
					
					if(arquivoVo.getXmlFileEnvioRoot() != null) {
						EntityManager manager = EntityManagerHelper.getEntityManager();

						XmlFileEnvioRoot xml = arquivoVo.getXmlFileEnvioRoot();
						
						try {
							manager.getTransaction().begin();						
							
							F55IJC80Id f55IJC80Id = new F55IJC80Id(xml.getF55ijc80().getJCBNNF(), xml.getF55ijc80().getJCBSER(), xml.getF55ijc80().getJCN001(), xml.getF55ijc80().getJCDCT());
							F55IJC80 f55ijc80 = new F55IJC80(f55IJC80Id, xml.getF55ijc80().getJCBNF0(),  xml.getF55ijc80().getJCBSR0(),  xml.getF55ijc80().getJCN002(),  xml.getF55ijc80().getJCBNFS(),  xml.getF55ijc80().getJCOCTO(),
									xml.getF55ijc80().getJCMCU(),  xml.getF55ijc80().getJCCO(),  xml.getF55ijc80().getJCFCO(),  xml.getF55ijc80().getJCSHAN(),  xml.getF55ijc80().getJCAN8(),  xml.getF55ijc80().getJCBCGT(),  xml.getF55ijc80().getJCBCPT(),
									xml.getF55ijc80().getJCSHST(),  xml.getF55ijc80().getJCSHZP(),  xml.getF55ijc80().getJCVR01(),  xml.getF55ijc80().getJCBSFH(),  xml.getF55ijc80().getJCAN8V(),  xml.getF55ijc80().getJCBCGF(),  xml.getF55ijc80().getJCBCPF(),
									xml.getF55ijc80().getJCADDS(),  xml.getF55ijc80().getJCBFRT(),  xml.getF55ijc80().getJCBSEG(),  xml.getF55ijc80().getJCBDFN(),  xml.getF55ijc80().getJCBDES(),
									xml.getF55ijc80().getJCBVTM(),  xml.getF55ijc80().getJCGDVL(),  xml.getF55ijc80().getJCBVTN(),  xml.getF55ijc80().getJCBICM(),  xml.getF55ijc80().getJCBBCL(),
									xml.getF55ijc80().getJCBVIS(),  xml.getF55ijc80().getJCBBIS(),  xml.getF55ijc80().getJCBREP(),  xml.getF55ijc80().getJCBDIZ(),  xml.getF55ijc80().getJCBVII(),
									xml.getF55ijc80().getJCBVOI(),  xml.getF55ijc80().getJCBIPI(),  xml.getF55ijc80().getJCBBTP(),  xml.getF55ijc80().getJCBVOP(),  xml.getF55ijc80().getJCBVIP(),
									xml.getF55ijc80().getJCBISS(),  xml.getF55ijc80().getJCBBCS(),  xml.getF55ijc80().getJCBIRT(),  xml.getF55ijc80().getJCBBCR(),  xml.getF55ijc80().getJCBIIT(),
									xml.getF55ijc80().getJCBBCI(),  xml.getF55ijc80().getJCIRRI(),  xml.getF55ijc80().getJCISSU(),  xml.getF55ijc80().getJCSHPJ(),  xml.getF55ijc80().getJCADDJ(),  xml.getF55ijc80().getJCCNDJ(),
									xml.getF55ijc80().getJCDETM(),  xml.getF55ijc80().getJCBINM(),  xml.getF55ijc80().getJCLNID(),  xml.getF55ijc80().getJCANCR(),  xml.getF55ijc80().getJCBCGC(),  xml.getF55ijc80().getJCCRTY(),  xml.getF55ijc80().getJCFRTH(),
									xml.getF55ijc80().getJCLICP(),  xml.getF55ijc80().getJCSTCD(),  xml.getF55ijc80().getJCTOQN(),  xml.getF55ijc80().getJCEQUP(),  xml.getF55ijc80().getJCR2(),  xml.getF55ijc80().getJCREF(),
									xml.getF55ijc80().getJCITWT(),  xml.getF55ijc80().getJCTOWT(),  xml.getF55ijc80().getJCBD01(),  xml.getF55ijc80().getJCAA1(),  xml.getF55ijc80().getJCBD02(),  xml.getF55ijc80().getJCAA2(),
									xml.getF55ijc80().getJCBD03(),  xml.getF55ijc80().getJCBD04(),  xml.getF55ijc80().getJCBVLF(),  xml.getF55ijc80().getJCUSER(),  xml.getF55ijc80().getJCPID(),  xml.getF55ijc80().getJCJOBN(),  xml.getF55ijc80().getJCUPMJ(),
									xml.getF55ijc80().getJCTDAY(),  xml.getF55ijc80().getJCBBIR(),  xml.getF55ijc80().getJCBIPR(),  xml.getF55ijc80().getJCCRCD(),  xml.getF55ijc80().getJCFTR(),  xml.getF55ijc80().getJCF1T(),
									xml.getF55ijc80().getJCUSB1(),  xml.getF55ijc80().getJCURRF(),  xml.getF55ijc80().getJCURAB(),  xml.getF55ijc80().getJCURAT(),  xml.getF55ijc80().getJCURDT(),  xml.getF55ijc80().getJCURCD(),  xml.getF55ijc80().getJCURC1(),
									xml.getF55ijc80().getJCURC2(),  xml.getF55ijc80().getJCDEJ(),  xml.getF55ijc80().getJCEV08(),  xml.getF55ijc80().getJCEV09(),  xml.getF55ijc80().getJCAA10(),  xml.getF55ijc80().getJCWTXT(),  xml.getF55ijc80().getJCEV01(),
									xml.getF55ijc80().getJCEV03(),  xml.getF55ijc80().getJCUK01(),  xml.getF55ijc80().getJCAA02(),  xml.getF55ijc80().getJCEV04(),  xml.getF55ijc80().getJCEV05(),  xml.getF55ijc80().getJCEV06(),  xml.getF55ijc80().getJCEV02(),
									xml.getF55ijc80().getJCEV07(),  xml.getF55ijc80().getJCID1(),  xml.getF55ijc80().getJCA201(),  xml.getF55ijc80().getJCAN01(),  xml.getF55ijc80().getJCAN02(),  xml.getF55ijc80().getJCEV11(),
									xml.getF55ijc80().getJCEV12(),  xml.getF55ijc80().getJCAA07(),  xml.getF55ijc80().getJCEV14(),  xml.getF55ijc80().getJCEV15(),  xml.getF55ijc80().getJCEV16(),  xml.getF55ijc80().getJCEV17(),  xml.getF55ijc80().getJCUK02(),
									xml.getF55ijc80().getJCBRNFDE(),  xml.getF55ijc80().getJCCAND(),  xml.getF55ijc80().getJCDTA1(),  xml.getF55ijc80().getJCA203(),  xml.getF55ijc80().getJCAG2(),  xml.getF55ijc80().getJCAAMT1(),
									xml.getF55ijc80().getJCADSD(),  xml.getF55ijc80().getJCCDCID(),  xml.getF55ijc80().getJCA202(),  xml.getF55ijc80().getJCLEG(),  xml.getF55ijc80().getJCBISC(),  xml.getF55ijc80().getJCERN(),  xml.getF55ijc80().getJCATRD(),
									xml.getF55ijc80().getJCB76ERN(),  xml.getF55ijc80().getJCAPTA());
							
							
							List<F55IJC81> f55ijc81List = new ArrayList<F55IJC81>();
							Long itemIndex = new Long(1);
							for(F55IJC81Item item : xml.getF55IJC81().getItem()) {							
								F55IJC81Id f55IJC81Id = new F55IJC81Id(xml.getF55ijc80().getJCBNNF(), xml.getF55ijc80().getJCBSER(), new Long(xml.getF55ijc80().getJCN001()), xml.getF55ijc80().getJCDCT(), itemIndex);
								F55IJC81 f55IJC81 = new F55IJC81(f55IJC81Id,  item.getJCSOS1(),  item.getJCBNF0(),  item.getJCBSR0(),  item.getJCN002(),  item.getJCBNFS(),
										 item.getJCOCTO(),  item.getJCMATC(),  item.getJCDOCO(),  item.getJCPDCT(),  item.getJCKCOO(),  item.getJCSFXO(),  item.getJCLNID(),
										 item.getJCNLIN(),  item.getJCDOC(),  item.getJCDCTO(),  item.getJCCO(),  item.getJCFCO(),  item.getJCITM(),  item.getJCLITM(),
										 item.getJCAITM(),  item.getJCCITM(),  item.getJCMCU(),  item.getJCLOCN(),  item.getJCLOTN(),  item.getJCDSC1(),  item.getJCDSC2(),
										 item.getJCLNTY(),  item.getJCUOM(),  item.getJCUORG(),  item.getJCUOM3(),  item.getJCUOM4(),  item.getJCUPRC(),
										 item.getJCAEXP(),  item.getJCBDES(),  item.getJCGLC(),  item.getJCSHAN(),  item.getJCAN8(),  item.getJCBCGT(),  item.getJCBCPT(),
										 item.getJCSHST(),  item.getJCSHZP(),  item.getJCBSFH(),  item.getJCAN8V(),  item.getJCBCGF(),  item.getJCBCPF(),  item.getJCADDS(),
										 item.getJCBNOP(),  item.getJCBSOP(),  item.getJCBDIP(),  item.getJCBCLF(),  item.getJCBCTF(),  item.getJCBIST(),  item.getJCBORI(),
										 item.getJCBCFC(),  item.getJCBSTT(),  item.getJCBFRT(),  item.getJCBSEG(),  item.getJCBDFN(),  item.getJCBICM(),
										 item.getJCTXR1(),  item.getJCBBCL(),  item.getJCBBIR(),  item.getJCBVIS(),  item.getJCBBIS(),
										 item.getJCBREP(),  item.getJCBDIZ(),  item.getJCBICP(),  item.getJCBFII(),  item.getJCBIPR(),
										 item.getJCBIPI(),  item.getJCTXR2(),  item.getJCBBTP(),  item.getJCBFIP(),  item.getJCBISS(),
										 item.getJCTXR3(),  item.getJCBBCS(),  item.getJCBIRT(),  item.getJCTXR4(),  item.getJCBBCR(),
										 item.getJCBIIT(),  item.getJCTXR5(),  item.getJCBBCI(),  item.getJCANI(),  item.getJCAID(),  item.getJCOMCU(),
										 item.getJCOBJ(),  item.getJCSUB(),  item.getJCSBLT(),  item.getJCSBL(),  item.getJCBINM(),  item.getJCISSU(),  item.getJCBNIV(),
										 item.getJCPGNO(),  item.getJCNXTR(),  item.getJCLTTR(),  item.getJCUSER(),  item.getJCPID(),  item.getJCJOBN(),  item.getJCUPMJ(),
										 item.getJCTDAY(),  item.getJCCRCD(),  item.getJCFTR(),  item.getJCF1T(),  item.getJCF2A(),  item.getJCF2T(),
										 item.getJCUSB1(),  item.getJCFLD3(),  item.getJCFLD4(),  item.getJCURRF(),  item.getJCURAB(),  item.getJCURAT(),  item.getJCURDT(),
										 item.getJCURCD(),  item.getJCURC1(),  item.getJCURC2(),  item.getJCBRNOP(),  item.getJCAN01(),  item.getJCAN02(),
										 item.getJCAN03(),  item.getJCVT01(),  item.getJCVT02(),  item.getJCAA05(),  item.getJCPP01(),  item.getJCDL01(),
										 item.getJCSGTXT(),  item.getJCVSTTR(),  item.getJCAG1(),  item.getJCAG2(),  item.getJCAAMT1(),
										 item.getJCAPCD(),  item.getJCAA10(),  item.getJCLCNF(),  item.getJCB76SFCT(),  item.getJCCITY1(),  item.getJCADDLCMT(),
										 item.getJCC9MCU(),  item.getJCG70CC03(),  item.getJCEV02(),  item.getJCA120(),  item.getJCEV16(),  item.getJCPEID(),
										 item.getJCB76APID(),  item.getJCAPDO(),  item.getJC74UCR(),  item.getJCEV24(),  item.getJCEV23(),  item.getJCEV22(),  item.getJCEV21(),
										 item.getJCEV20(),  item.getJCEV25(),  item.getJCAN04(),  item.getJCAN05(),  item.getJCAN06(),  item.getJCAN07(),
										 item.getJCVT04(),  item.getJCVT06(),  item.getJCAN10(),  item.getJCAN12(),  item.getJCAN08(),
										 item.getJCAN11(),  item.getJCAN13(),  item.getJCAN09(),  item.getJCVT10(),  item.getJCVT12(),
										 item.getJCVT08(),  item.getJCAGEN(),  item.getJC54RBDPW(),  item.getJCEV01(),  item.getJCEV08(),  item.getJCD200());
								
								itemIndex++;
								f55ijc81List.add(f55IJC81);
								
							}					
							
							List<F55IJC83> f55ijc83List = new ArrayList<F55IJC83>();
							itemIndex = new Long(1);						
							for(F55IJC83Item item : xml.getF55IJC83().getItem()) {	
								F55IJC83Id f55IJC83Id = new F55IJC83Id(xml.getF55ijc80().getJCBNNF(), xml.getF55ijc80().getJCBSER(), new Long(xml.getF55ijc80().getJCN001()), xml.getF55ijc80().getJCDCT(), item.getJCNSP());
								F55IJC83 f55IJC83 = new F55IJC83(f55IJC83Id, item.getJCAEXP(),  item.getJCKI03(),  item.getJCCHAR(),  item.getJCAA(),  item.getJCAA1(),
										item.getJCIMVD(),  item.getJCFBDPRCD(),  item.getJCUSER(),  item.getJCTORG(),  item.getJCPID(),  item.getJCJOBN(),  item.getJCUPMJ(),
										item.getJCUPMT(),  item.getJCURRF(),  item.getJCURAB(),  item.getJCURAT(),  item.getJCURDT(),  item.getJCURCD(),  item.getJCURC1(),
										item.getJCURC2(),  item.getJCDDJ(),  item.getJCCRPR());
								
								itemIndex++;
								f55ijc83List.add(f55IJC83);
								
							}
							
							List<F55IJC84> f55ijc84List = new ArrayList<F55IJC84>();
							itemIndex = new Long(1);						
							for(F55IJC84Item item : xml.getF55IJC84().getItem()) {
								F55IJC84Id f55IJC84Id = new F55IJC84Id(xml.getF55ijc80().getJCBNNF(), xml.getF55ijc80().getJCBSER(), new Long(xml.getF55ijc80().getJCN001()), xml.getF55ijc80().getJCDCT(), item.getJCIA01());
								F55IJC84 f55IJC84 = new F55IJC84(f55IJC84Id, item.getJCKY1(),  item.getJCEV02(),  item.getJCDQ01(),  item.getJCDQ02(),  null,
										item.getJCPP01(),  item.getJCAA02(),  item.getJCKA01(),  item.getJCQ60(),  item.getJCPDSC(),  item.getJCTXLN(),  null,
										item.getJCAA08(),  item.getJCCMT1(),  item.getJCCMT2(),  item.getJCAA09(),  item.getJCAA04(),  item.getJCA901(),  item.getJCCL02(),
										item.getJCCH2(),  item.getJCCH3(),  item.getJCEV03(),  item.getJCEV04(),  item.getJCAA12(),  item.getJCAA11(),  item.getJCKI08(),
										item.getJCTD1(),  item.getJCMSFX(),  item.getJCRT01(),  item.getJCAA20(),  item.getJCXDEC(),  item.getJCUSER(),  item.getJCTORG(),
										item.getJCPID(),  item.getJCJOBN(),  item.getJCUPMJ(),  item.getJCUPMT(),  item.getJCURRF(),  item.getJCURAB(),
										item.getJCURAT(),  item.getJCURDT(),  item.getJCURCD(),  item.getJCURC1(),  item.getJCURC2(),  item.getJCWTXT(),  item.getJCAA10(),
										item.getJCAN8(),  item.getJCAAIL(),  item.getJCDESTIN(),  item.getJCEMAL(),  item.getJCEV05());							
								
								itemIndex++;
								f55ijc84List.add(f55IJC84);
							}

							F55IJC02Id f55IJC02Id = new F55IJC02Id(xml.getF55ijc80().getJCBNNF(), xml.getF55ijc80().getJCBSER(), xml.getF55ijc80().getJCN001(), xml.getF55ijc80().getJCDCT());
							F55IJC02 f55IJC02 = new F55IJC02(f55IJC02Id, xml.getF55IJC02().getJCB76ELN(), xml.getF55IJC02().getJCB76ELND(), xml.getF55IJC02().getJCB76EREF(), xml.getF55IJC02().getJCB76ELNT(),
									xml.getF55IJC02().getJCCDCID(), xml.getF55IJC02().getJCA202(), xml.getF55IJC02().getJCUSER(), xml.getF55IJC02().getJCUPMJ(), xml.getF55IJC02().getJCUPMT(),
									xml.getF55IJC02().getJCJOBN(), xml.getF55IJC02().getJCPID());
							
							manager.persist(f55IJC02);
							manager.persist(f55ijc80);
							for(F55IJC81 item : f55ijc81List){
								manager.persist(item);
							}
							for(F55IJC83 item : f55ijc83List){
								manager.persist(item);
							}
							for(F55IJC84 item : f55ijc84List){
								manager.persist(item);
							}
							manager.getTransaction().commit();

							String sourceStr = caminhosVO.getRecebido() + "\\" + arquivoVo.getNome();
							String destStr = caminhosVO.getProcessando() + "\\" + arquivoVo.getNome();

							xmlFileControl.moveFile(sourceStr, destStr);
						} catch (Exception e) {
							e.printStackTrace(); //TODO: logar registros que não foi importado e mover pra pasta de erro
							//xmlFileControl.moveFile(null, null);
							log.error("## ERRO DE INTEGRACAO: ERRO AO INICIALIZAR O PROCESSO COM OS ARQUIVOS E BANCO LOCAL - EXCECAO --> " + e);
							if (manager.getTransaction().isActive()) {
								manager.getTransaction().rollback();
							}
						} finally {
							manager.close();
						}


						log.info("## INICIANDO MONTAGEM DOS OBJETOS DE EMISSAO ##");
						listF55IJC80 = f55IJC80Dao.getF55IJC80byStatus(STATUS_EMISSAO);
						//montaObjetos();
						log.info("## FINALIZANDO PROCESSO DE EMISSAO ##");	
						
					}else {
						log.info("++ NENHUM ARQUIVO ENCONTRADO ++");
						log.info("## FINALIZANDO PROCESSO DE EMISSAO ##");
					}									
				}				
			}else {
				log.info("++ NENHUM ARQUIVO ENCONTRADO ++");
				log.info("## FINALIZANDO PROCESSO DE EMISSAO ##");
			}			
		} catch (Exception ex) {
			log.error("## ERRO DE INTEGRACAO: ERRO AO INICIALIZAR O PROCESSO - EXCECAO --> " + ex.getMessage());
		}
	}

	public void montaObjetos() {

		log.info("## Montando Objetos - Percorrendo listagem de notas ##");
		
		try {
			
			if (!listF55IJC80.isEmpty()) {
				log.info("Notas Listadas: " + listF55IJC80.toString());
				Iterator<F55IJC80> it = listF55IJC80.iterator();
				while (it.hasNext()) {
					try {
						F55IJC80 f = it.next();

						log.info("## Nota ##");
						log.info("+ Numero: " + f.getId().getJCBNNF());
						log.info("+ Serie: " + f.getId().getJCBSER());
						log.info("+ Pre Nota: " + f.getId().getJCN001());
						log.info("+ Tipo: " + f.getId().getJCDCT());
						
						envioVO = new EnvioVO();
						
						envioVO.setHeader(f);
						envioVO.setId(f.getId());
						envioVO.setDetalheNFeList(f55IJC81Dao.listF55IJC81ById(envioVO.getId()));						
						envioVO.setVencimentoNFeList(f55IJC83Dao.listF55IJC83ById(envioVO.getId()));
						envioVO.setParticipanteNFeList(f55IJC84Dao.listF55IJC84ById(envioVO.getId()));						

						List<F55IJC84> listPart = f55IJC84Dao.listF55IJC84ById(envioVO.getId());

						for (F55IJC84 part : listPart) {
							if (part.getId().getJCIA01() == 5) {
								envioVO.setCodigoMultOrg(part.getJCAAIL());
								envioVO.setHashMultOrg(part.getJCDESTIN());
							}
						}

						if (envioVO.getCodigoMultOrg() != null && !envioVO.getCodigoMultOrg().isEmpty()) {
							autenticacao = new MultOrgAuthentication(envioVO.getCodigoMultOrg(),
									envioVO.getHashMultOrg());
						}

						cadastraItem(servicesVO.getItemServiceURL());
						cadastraParticipante(servicesVO.getParticipanteServiceURL());
						cadastrarNaturezaOperacao(servicesVO.getNatOpServiceURL());
						cadastrarUnidade(servicesVO.getUnidadeServiceURL());

						envioNFSe(servicesVO.getEnvioNFeServiceURL());

						atualizaF55IJC80(loteEnvio);

					} catch (Exception ex) {
						log.error("## ERRO DE INTEGRACAO: NOTA --> " + envioVO.getId().getJCBNNF() + " EXCECAO --> "
								+ ex);
						ExceptionHelper.error(ex);

						try {
							f55IJC80Dao.updateF55IJC80Erro(envioVO.getId());
							//f76B01TEDao.updateF76b01teErro(envioVO.getF76b01te());
						} catch (Exception e) {
							log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
									+ envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);

							ExceptionHelper.error(ex);
						}
					}

				}
			} else {
				log.info("++ Nao ha notas para envio.");
			}

		} catch (Exception exIbge) {//catch (IOException exIbge) {
			log.error("## ERRO DE INTEGRACAO: ARQUIVO IBGE NAO ENCONTRADO - EXCECAO --> "
					+ exIbge);
			ExceptionHelper.error(exIbge);

			try {
				f55IJC80Dao.updateF55IJC80Erro(envioVO.getId());
				//f76B01TEDao.updateF76b01teErro(envioVO.getF76b01te());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: ERRO AO ATUALIZAR F55IJC80 E F76B01TE - EXCECAO --> " + e);	
			}
		}

		log.info("## Fechando o metodo de montagem de Objetos ##");
	}

	public void atualizaF55IJC80(String numeroLote) {

		if (numeroLote != null) {
			envioVO.getHeader().setJCDEJ(DateUtil.convertToJulian(new Date()));
			envioVO.getHeader().setJCUK02(Long.parseLong(numeroLote));
			envioVO.getHeader().setJCBRNFDE(DateUtil.convertToJulian(new Date()));

			try {
				f55IJC80Dao.updateF55IJC80(envioVO.getHeader());
			} catch (Exception e) {
				log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> " + envioVO.getId().getJCBNNF()
						+ " EXCECAO --> " + e);
				ExceptionHelper.error(e);
			}
		}
	}

	public void envioNFSe(String emissaoServicoURL) throws Exception {

		log.info("## Cadastro de NFe ##");

		if (autenticacao != null) {
			if (envioVO.getHeader() != null) {

				NfServicoVO vo = new NfServicoVO();
				NfServicos nfe = vo.montaNfSe(envioVO);

				NfServicos[] nfeArray = new NfServicos[1];
				nfeArray[0] = nfe;

				EmissaoTercNfServicoRequest nfeParameters = new EmissaoTercNfServicoRequest(nfeArray, autenticacao);
				NfServicoEmissaoService_ServiceLocator loc = new NfServicoEmissaoService_ServiceLocator();
				loc.setNfServicoEmissaoServiceSOAP_address(emissaoServicoURL);

				loteEnvio = "";

				try {

					NfServicoEmissaoService_PortType cad = loc.getnfServicoEmissaoServiceSOAP();
					EmissaoTercNfServicoResponse response = cad.emissaoTercNfServico(nfeParameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();

					log.info("++ Cadastro NFe : Protocolo do lote = " + lote.getNumeroProtocoloLote());

					loteEnvio = lote.getNumeroProtocoloLote().toString();					

				} catch (ServiceException e) {
					log.error(
							"## ERRO DE INTEGRACAO: NOTA --> " + envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);
					for (StackTraceElement s : e.getStackTrace()) {
						log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

					}
				} catch (RemoteException e) {
					e.printStackTrace();
					log.error("## ERRO DE INTEGRACAO: ENVIO DE NOTA -- NOTA --> " + envioVO.getId().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro NFe: Nao ha NFe para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro NFe: Nao ha codigo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastraParticipante(String participanteServiceURL) throws Exception {

		log.info("## Cadastro de Participante ##");

		if (autenticacao != null) {
			if (envioVO.getParticipanteNFeList() != null) {
				List<Participante> pList = ParticipanteVO.montaParticipantes(envioVO);
				Participante[] pArray = Arrays.copyOf(pList.toArray(), pList.toArray().length, Participante[].class);
				ParticipanteService_ServiceLocator loc = new ParticipanteService_ServiceLocator();
				loc.setParticipanteServiceSOAP_address(participanteServiceURL);
				CadastrarParticipanteRequest parameters = new CadastrarParticipanteRequest(pArray, autenticacao);
				try {
					ParticipanteService_PortType cad = loc.getparticipanteServiceSOAP();
					CadastrarParticipanteResponse response = cad.cadastrarParticipante(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info("++ Cadastro Participante : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO PARTICIPANTE -- NOTA --> "
							+ envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Item: Nï¿½o hï¿½ Participante para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Participante: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastraItem(String itemServiceURL) throws Exception {

		log.info("## Cadastro de Item ##");

		if (autenticacao != null) {
			if (envioVO.getDetalheNFeList() != null) {

				List<Item> itemList = ItemVO.montarItem(envioVO);

				Item[] itensArray = Arrays.copyOf(itemList.toArray(), itemList.toArray().length, Item[].class);
				ItemService_ServiceLocator loc = new ItemService_ServiceLocator();
				loc.setItemServiceSOAP_address(itemServiceURL);
				CadastrarItemRequest parameters = new CadastrarItemRequest(autenticacao, itensArray);

				try {
					ItemService_PortType cad = loc.getitemServiceSOAP();
					CadastrarItemResponse response = cad.cadastrarItem(parameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();

					log.info("++ Cadastro Item : Protocolo do lote = " + lote.getNumeroProtocoloLote());

				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> " + envioVO.getId().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO ITEM -- NOTA --> " + envioVO.getId().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Item: Nï¿½o hï¿½ itens para serem cadastrados ++");
			}
		} else {
			log.info("++ Cadastro Item: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastrarNaturezaOperacao(String natOpServiceURL) throws Exception {

		log.info("## Cadastro de Natureza Operaï¿½ï¿½o ##");

		if (autenticacao != null) {
			if (envioVO.getHeader() != null) {
				List<NaturezaOperacao> natOpList = NaturezaOperacaoVO.montaNatOp(envioVO);
				NaturezaOperacao[] natOprArray = Arrays.copyOf(natOpList.toArray(), natOpList.toArray().length,
						NaturezaOperacao[].class);
				NaturezaOperacaoService_ServiceLocator loc = new NaturezaOperacaoService_ServiceLocator();
				loc.setNaturezaOperacaoServiceSOAP_address(natOpServiceURL);
				CadastrarNaturezaOpRequest parameters = new CadastrarNaturezaOpRequest(natOprArray, autenticacao);
				try {
					NaturezaOperacaoService_PortType cad = loc.getnaturezaOperacaoServiceSOAP();
					CadastrarNaturezaOpResponse response = cad.cadastrarNaturezaOp(parameters);
					LoteIntWSResponse lote = response.getLoteWsResponse();
					log.info(
							"++ Cadastro Natureza Operaï¿½ï¿½o : Protocolo do lote = " + lote.getNumeroProtocoloLote());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO NATUREZA OPERACAO -- NOTA --> "
							+ envioVO.getId().getJCBNNF() + " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Natureza Operação: Nï¿½o hï¿½ Natureza Operaï¿½ï¿½o para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Natureza Operação: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}

	public void cadastrarUnidade(String unidadeServiceURL) throws Exception {

		log.info("## Cadastro de Unidade ##");

		if (autenticacao != null) {
			if (envioVO.getDetalheNFeList() != null) {
				List<Unidade> unidadeList = UnidadeVO.montaUnidade(envioVO);
				Unidade[] unidadeArray = Arrays.copyOf(unidadeList.toArray(), unidadeList.toArray().length,
						Unidade[].class);
				UnidadeService_ServiceLocator loc = new UnidadeService_ServiceLocator();
				loc.setUnidadeServiceSOAP_address(unidadeServiceURL);
				CadastrarUnidadeRequest parameters = new CadastrarUnidadeRequest(unidadeArray, autenticacao);
				try {
					UnidadeService_PortType cad = loc.getunidadeServiceSOAP();
					CadastrarUnidadeResponse response = cad.cadastrarUnidade(parameters);
					LoteIntWSResponse lote = response.getLoteWSResponse();
					System.out.println("Protocolo do lote: " + lote.getNumeroProtocoloLote());
					// consultaGenerica(lote.getNumeroProtocoloLote().toString());
				} catch (ServiceException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> " + envioVO.getId().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				} catch (RemoteException e) {
					log.error("## ERRO DE INTEGRACAO: CADASTRO UNIDADE -- NOTA --> " + envioVO.getId().getJCBNNF()
							+ " EXCECAO --> " + e);
					ExceptionHelper.error(e);
				}
			} else {
				log.info("++ Cadastro Unidade: Nï¿½o hï¿½ Unidades para serem cadastradas ++");
			}
		} else {
			log.info("++ Cadastro Unidade: Nï¿½o hï¿½ cï¿½digo de autenticaï¿½ï¿½o ++");
		}

	}
}
