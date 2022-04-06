package br.com.bv.nfe.agendador;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

public class CancelamentoNFeListener implements JobListener{

	public static final String LISTENER_NAME = "CancelamentoNFeListener";

	public String getName() {
		return LISTENER_NAME;
	}

	public void jobToBeExecuted(JobExecutionContext context) {
		String jobName = context.getJobDetail().getKey().toString();		
		System.out.println("Job : " + jobName + " esta sendo inciado...");
		
	}

	public void jobExecutionVetoed(JobExecutionContext context) {
		// TODO Auto-generated method stub
		//System.out.println("jobExecutionVetoed"); TODO: N�o sei pro que serve
		
	}

	public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
		String jobName = context.getJobDetail().getKey().toString();
		System.out.println("Job : " + jobName + " finalizado em: " +dateFormat.format(new Date()));

		if (!jobException.getMessage().equals("")) {
			System.out.println("Exception thrown by: " + jobName
				+ " Exception: " + jobException.getMessage());
		}
		
	}

}
