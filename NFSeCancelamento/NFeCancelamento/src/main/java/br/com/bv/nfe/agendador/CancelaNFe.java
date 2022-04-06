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

import br.com.bv.nfe.controle.CancelamentoControle;
import br.com.bv.nfe.vo.ServicesVO;

@DisallowConcurrentExecution
public class CancelaNFe implements Job {

	private static final Logger log = LogManager.getLogger(CancelaNFe.class.getName());

	public void execute(JobExecutionContext context) throws JobExecutionException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy – HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " iniciado em: " + dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String cancelamentoServiceURL = properties.getProperty("cancelamento").trim();
			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();

			log.info("## URL Servicos Compliance ##");
			log.info("Consulta: " + consultaServiceURL);
			log.info("Cancelamento: " + cancelamentoServiceURL);

			CancelamentoControle cancelCtrl = new CancelamentoControle();
			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setCancelamentoServiceURL(cancelamentoServiceURL);
			servicesVO.setConsultaServiceURL(consultaServiceURL);

			cancelCtrl.inicializaProcesso(servicesVO);
		} catch (Exception ex) {
			log.error("## Erro Job Cancelamento: " + ex);
		}
		System.out.println("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));

	}

}
