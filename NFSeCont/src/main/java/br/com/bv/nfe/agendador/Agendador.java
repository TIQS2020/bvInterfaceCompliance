package br.com.bv.nfe.agendador;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.TriggerKey;
import org.quartz.impl.StdSchedulerFactory;

public class Agendador {

	private static JobKey jobKeyEmissaoNFSeCont = null;

	private static JobDetail jobEmissaoNFSeCont = null;

	private static Trigger triggerEmissaoNFSeCont = null;

	private static Scheduler schedulerEmissaoNFSeCont = null;
	

	public static void inicia() throws Exception {

		jobKeyEmissaoNFSeCont = new JobKey("jobEmissaoEntrada", JobKey.DEFAULT_GROUP);

		jobEmissaoNFSeCont = JobBuilder.newJob(EmissaoNFSeCont.class).withIdentity(jobKeyEmissaoNFSeCont).build();

		triggerEmissaoNFSeCont = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerEmissaoNFSeCont", TriggerKey.DEFAULT_GROUP)
				.withSchedule(
					CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
				.build();

		schedulerEmissaoNFSeCont = new StdSchedulerFactory().getScheduler();		

		schedulerEmissaoNFSeCont.start();

		schedulerEmissaoNFSeCont.scheduleJob(jobEmissaoNFSeCont, triggerEmissaoNFSeCont);

	}

}
