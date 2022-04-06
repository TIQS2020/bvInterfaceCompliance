package br.com.bv.nfe.agendador;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import br.com.bv.nfe.controle.EnvioControle;
import br.com.bv.vo.ServicesVO;

@DisallowConcurrentExecution
public class EnvioNFe implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy – HH:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " iniciado em: " + dateFormat.format(new Date()));

		try {
			InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
			Properties properties = new Properties();
			properties.load(input);

			String consultaServiceURL = properties.getProperty("consultaGenerica").trim();
			String envioNFeServiceURL = properties.getProperty("emissaoServico").trim();
			String participanteServiceURL = properties.getProperty("participante").trim();
			String itemServiceURL = properties.getProperty("item").trim();
			String unidadeServiceURL = properties.getProperty("unidade").trim();
			String natOpServiceURL = properties.getProperty("naturezaOperacao").trim();
			String paramIcmsServiceURL = properties.getProperty("parametrosICMS").trim();
			String infoComplDocServiceURL = properties.getProperty("infoComplDoc").trim();
			//String servicoServiceURL = properties.getProperty("servicoEFD").trim();

			EnvioControle eCtrl = new EnvioControle();

			ServicesVO servicesVO = new ServicesVO();
			servicesVO.setConsultaServiceURL(consultaServiceURL);
			servicesVO.setEnvioNFeServiceURL(envioNFeServiceURL);
			servicesVO.setInfoComplDocServiceURL(infoComplDocServiceURL);
			servicesVO.setItemServiceURL(itemServiceURL);
			servicesVO.setNatOpServiceURL(natOpServiceURL);
			servicesVO.setParamIcmsServiceURL(paramIcmsServiceURL);
			servicesVO.setParticipanteServiceURL(participanteServiceURL);
			servicesVO.setUnidadeServiceURL(unidadeServiceURL);
			//servicesVO.setServicoServiceURL(servicoServiceURL);
			
			eCtrl.inicializaProcesso(servicesVO);

		} catch (Exception ex) {
			ex.printStackTrace();
			throw new JobExecutionException(ex);
		}
		System.out.println("Job : " + jobName + " finalizado em: " + dateFormat.format(new Date()));

	}

}
