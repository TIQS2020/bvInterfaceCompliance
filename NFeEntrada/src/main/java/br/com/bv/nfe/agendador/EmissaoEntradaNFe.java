package br.com.bv.nfe.agendador;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import br.com.bv.nfe.controle.EmissaoEntradaControle;
import br.com.bv.vo.ServicesVO;

@DisallowConcurrentExecution
public class EmissaoEntradaNFe implements Job {

	private static final Logger log = LogManager.getLogger(EmissaoEntradaNFe.class.getName());

	public void execute(JobExecutionContext context) throws JobExecutionException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		log.info("Job : " + jobName + " iniciado em: " + dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();

			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();
			String emissaoEntradaServiceURL = properties.getProperty("emissaoEntrada").trim();
			String natOpServiceURL = properties.getProperty("naturezaOperacao").trim();
			String servicoEFD = properties.getProperty("servicoEFD").trim();
			String emissaoNFSeContServiceURL = properties.getProperty("emissaoNFSeCont").trim();	
			
			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);
			servicesVO.setItemServiceURL(itemServiceURL);
			servicesVO.setParticipanteServiceURL(participanteServiceURL);
			servicesVO.setEmissaoEntradaServiceURL(emissaoEntradaServiceURL);
			servicesVO.setNatOpServiceURL(natOpServiceURL);
			servicesVO.setEmissaoEFDURL(servicoEFD);
			servicesVO.setEmissaoNFSeContServiceURL(emissaoNFSeContServiceURL);
			// servicesVO.setUnidadeServiceURL(unidadeServiceURL);
			
			EmissaoEntradaControle eCtrl = new EmissaoEntradaControle();
			eCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		log.info("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));

	}

}
