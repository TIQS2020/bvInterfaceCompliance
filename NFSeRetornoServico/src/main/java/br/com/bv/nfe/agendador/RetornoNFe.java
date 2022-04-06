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

import br.com.bv.nfe.controle.RetornoEntradaControle;

@DisallowConcurrentExecution
public class RetornoNFe implements Job {
	
	private static final Logger log = LogManager.getLogger(RetornoEntradaControle.class.getName());

	public void execute(JobExecutionContext context) throws JobExecutionException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy – HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		log.info("Job : " + jobName + " iniciado em: " +dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String retornoServiceURL = properties.getProperty("consultaGenerica").trim();		
			
			/*Acrescimo retorno da NF Entrada*/
			RetornoEntradaControle rEntradaCtrl = new RetornoEntradaControle();
			rEntradaCtrl.inicializaProcesso(retornoServiceURL);
			
		} catch (Exception ex) {
			log.error("## Erro Job Retorno: " + ex);
		}
		log.info("Job : " + jobName + " finalizado em: " +dateFormat.format(new Date()));
	}

}
