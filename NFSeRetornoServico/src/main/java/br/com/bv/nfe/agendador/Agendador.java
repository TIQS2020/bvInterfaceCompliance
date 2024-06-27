package br.com.bv.nfe.agendador;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

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
		
		InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
		Properties properties = new Properties();
		properties.load(input);

		String intervaloRetornoProp = properties.getProperty("intervaloRetorno").trim();
		String cron = "0 0/"+intervaloRetornoProp+" * * * ?";
		
		triggerRetorno = TriggerBuilder
				.newTrigger()
				.withIdentity("triggerRetorno", TriggerKey.DEFAULT_GROUP)
				.withSchedule(
					CronScheduleBuilder.cronSchedule(cron))
				.build();
		
		schedulerRetorno = new StdSchedulerFactory().getScheduler();	
		
		//scheduler.getListenerManager().addJobListener(new RetornoNfeListener(), KeyMatcher.keyEquals(jobKeyRetorno));
		
		schedulerRetorno.start();	
		
		schedulerRetorno.scheduleJob(jobRetorno, triggerRetorno);	

	}

}
