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

public class Agendador {

	private static JobKey jobKeyCancelamento = null;

	private static JobDetail jobCancelamento = null;

	private static Trigger triggerCancelamento = null;

	private static Scheduler schedulerCancelamento = null;

	public static void inicia() throws Exception {
		
		InputStream input = new FileInputStream("c:/Java/resources/webservices.properties");
		Properties properties = new Properties();
		properties.load(input);

		String intervaloCancelamentoProp = properties.getProperty("intervaloCancelamento").trim();
		String cron = "0 0/"+intervaloCancelamentoProp+" * * * ?";
		
		jobKeyCancelamento = new JobKey("jobCancelamento", JobKey.DEFAULT_GROUP);

		jobCancelamento = JobBuilder.newJob(CancelaNFe.class).withIdentity(jobKeyCancelamento).build();

		triggerCancelamento = TriggerBuilder.newTrigger().withIdentity("triggerCancelamento", TriggerKey.DEFAULT_GROUP)
				.withSchedule(CronScheduleBuilder.cronSchedule(cron)).build();

		schedulerCancelamento = new StdSchedulerFactory().getScheduler();

		// schedulerEnvio.getListenerManager().addJobListener(new
		// EnvioNFeListener(), KeyMatcher.keyEquals(jobKeyEnvio));

		schedulerCancelamento.start();

		schedulerCancelamento.scheduleJob(jobCancelamento, triggerCancelamento);

	}

}
