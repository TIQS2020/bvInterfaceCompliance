package br.com.compliance.nfe.jpa;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.spi.PersistenceUnitTransactionType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.persistence.config.PersistenceUnitProperties;

import br.com.compliance.nfe.util.AppConfig;

public class EntityManagerHelper {
	private static final Logger log = LogManager.getLogger(EntityManagerHelper.class.getName());
	private static final EntityManagerFactory emfJDE;
	private static final ThreadLocal<EntityManager> threadLocalJDE;

	static {

		try {
		    new AppConfig();
		} catch (IOException e) {
			//e.printStackTrace();
			log.error("## ERRO DE INTEGRACAO: ERRO NA LEITURA DO ARQUIVO DE CONFIGURACAO - EXCECAO --> "
					+ e.getMessage());
			for (StackTraceElement s : e.getStackTrace()) {
				log.error(" - METODO: " + s.getFileName() + " - LINHA: " + s.getLineNumber());

			}
		}

		Map<String, Object> properties = new HashMap<String, Object>();

		properties.put(PersistenceUnitProperties.TRANSACTION_TYPE,
				PersistenceUnitTransactionType.RESOURCE_LOCAL.name());
		properties.put(PersistenceUnitProperties.METADATA_SOURCE, "XML"); // Mapear arquivo ORM para schema
		properties.put(PersistenceUnitProperties.METADATA_SOURCE_XML_FILE, AppConfig.getMetadataSourceXmlFile()); // Mapear
																													// arquivo
																													// ORM
																													// para
																													// schema
		properties.put(PersistenceUnitProperties.JDBC_URL, AppConfig.getUrl());
		properties.put(PersistenceUnitProperties.JDBC_USER, AppConfig.getUser());
		properties.put(PersistenceUnitProperties.JDBC_PASSWORD, AppConfig.getPassword());
		properties.put(PersistenceUnitProperties.JDBC_DRIVER, AppConfig.getDriver());
		properties.put(PersistenceUnitProperties.LOGGING_LEVEL, "FINE");
		properties.put(PersistenceUnitProperties.LOGGING_FILE, AppConfig.getJpaLogginFile());

		emfJDE = Persistence.createEntityManagerFactory("NFeComplianceJPA", properties);

		threadLocalJDE = new ThreadLocal<EntityManager>();

	}

	public static EntityManager getEntityManager() {
		EntityManager manager = threadLocalJDE.get();
		if (manager == null || !manager.isOpen()) {
			manager = emfJDE.createEntityManager();
			threadLocalJDE.set(manager);
		}
		return manager;
	}

	public static void closeEntityManager() {
		EntityManager em = threadLocalJDE.get();
		if (em != null) {
			threadLocalJDE.set(null);
			em.close();
		}
	}

}
