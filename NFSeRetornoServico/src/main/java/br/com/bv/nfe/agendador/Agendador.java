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
import org.quartz.impl.matchers.KeyMatcher;


public class Agendador {

	private static JobKey jobKeyRetorno = null;

	private static JobDetail jobRetorno = null;

	private static Trigger triggerRetorno = null;

	private static Scheduler schedulerRetorno = null;	

	public static void inicia() throws Exception {

		jobKeyRetorno = new JobKey("jobRetorno", JobKey.DEFAULT_GROUP);
		jobRetorno = JobBuilder.newJob(RetornoNFe.class).withIdentity(jobKeyRetorno).build();
		
		/*
		triggerRetorno = TriggerBuilder.newTrigger().withIdentity("triggerRetorno", "group1")
				.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).repeatForever()).build();
		*/
		
		triggerRetorno = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerRetorno", TriggerKey.DEFAULT_GROUP)
				.withSchedule(
					CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
				.build();
		
		schedulerRetorno = new StdSchedulerFactory().getScheduler();	
		
		//scheduler.getListenerManager().addJobListener(new RetornoNfeListener(), KeyMatcher.keyEquals(jobKeyRetorno));
		
		schedulerRetorno.start();	
		
		schedulerRetorno.scheduleJob(jobRetorno, triggerRetorno);	

	}

}
