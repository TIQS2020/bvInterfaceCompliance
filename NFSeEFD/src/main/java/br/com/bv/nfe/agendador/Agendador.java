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

	private static JobKey jobKeyEmissaoEntrada = null;

	private static JobDetail jobEmissaoEntrada = null;

	private static Trigger triggerEmissaoEntrada = null;

	private static Scheduler schedulerEmissaoEntrada = null;
	

	public static void inicia() throws Exception {

		jobKeyEmissaoEntrada = new JobKey("jobEmissaoEntrada", JobKey.DEFAULT_GROUP);

		jobEmissaoEntrada = JobBuilder.newJob(EmissaoEFDNFe.class).withIdentity(jobKeyEmissaoEntrada).build();

		triggerEmissaoEntrada = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerEmissaoEntrada", TriggerKey.DEFAULT_GROUP)
				.withSchedule(
					CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
				.build();

		schedulerEmissaoEntrada = new StdSchedulerFactory().getScheduler();		

		schedulerEmissaoEntrada.start();

		schedulerEmissaoEntrada.scheduleJob(jobEmissaoEntrada, triggerEmissaoEntrada);

	}

}
