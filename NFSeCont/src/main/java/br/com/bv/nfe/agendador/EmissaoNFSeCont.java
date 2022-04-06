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

import br.com.bv.nfe.controle.EmissaoNFSeContControle;
import br.com.bv.vo.ServicesVO;

@DisallowConcurrentExecution
public class EmissaoNFSeCont implements Job {
	
	private static final Logger log = LogManager.getLogger(EmissaoNFSeContControle.class.getName());

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
			String emissaoNFSeContServiceURL = properties.getProperty("emissaoNFSeCont").trim();
			
			EmissaoNFSeContControle eCtrl = new EmissaoNFSeContControle();

			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);	
			servicesVO.setEmissaoNFSeContServiceURL(emissaoNFSeContServiceURL);					

			eCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		log.info("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));

	}

}
