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

	private static JobKey jobKeyEnvio = null;

	private static JobDetail jobEnvio = null;

	private static Trigger triggerEnvio = null;

	private static Scheduler schedulerEnvio = null;

	public static void inicia() throws Exception {

		jobKeyEnvio = new JobKey("jobEnvio", JobKey.DEFAULT_GROUP);

		jobEnvio = JobBuilder.newJob(EnvioNFe.class).withIdentity(jobKeyEnvio).build();

		triggerEnvio = TriggerBuilder.newTrigger().withIdentity("triggerEnvio", TriggerKey.DEFAULT_GROUP)
				.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?")).build();

		schedulerEnvio = new StdSchedulerFactory().getScheduler();

		// schedulerEnvio.getListenerManager().addJobListener(new
		// EnvioNFeListener(), KeyMatcher.keyEquals(jobKeyEnvio));

		schedulerEnvio.start();

		schedulerEnvio.scheduleJob(jobEnvio, triggerEnvio);

	}

}
