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

import br.com.bv.nfe.controle.RetornoControle;
import br.com.compliance.nfe.util.AppConfig;

@DisallowConcurrentExecution
public class RetornoNFe implements Job {

	private static final Logger log = LogManager.getLogger(RetornoNFe.class.getName());

	public void execute(JobExecutionContext context) throws JobExecutionException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy – HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " iniciado em: " + dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream(AppConfig.getWEB_SERVICES_PATH());

			Properties properties = new Properties();
			properties.load(input);

			String retornoServiceURL = properties.getProperty("consultaGenerica").trim();

			RetornoControle rCtrl = new RetornoControle();
			rCtrl.inicializaProcesso(retornoServiceURL);

		} catch (Exception ex) {
			log.error("## Erro Job Retorno: " + ex);
		}
		System.out.println("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));
	}

}
