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

import br.com.bv.nfe.controle.EmissaoEFDControle;
import br.com.bv.nfe.vo.ServicesVO;

@DisallowConcurrentExecution
public class EmissaoEFDNFe implements Job {
	
	private static final Logger log = LogManager.getLogger(EmissaoEFDControle.class.getName());

	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy – HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		log.info("Job : " + jobName + " iniciado em: " + dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();			
			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();					
			String servicoEFD = properties.getProperty("servicoEFD").trim();
			
			EmissaoEFDControle eCtrl = new EmissaoEFDControle();

			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);			
			servicesVO.setItemServiceURL(itemServiceURL);			
			servicesVO.setParticipanteServiceURL(participanteServiceURL);		
			servicesVO.setEmissaoEFD(servicoEFD);

			eCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		log.info("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));

	}

}
