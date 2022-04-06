package br.com.compliance.nfe.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class AppConfig {
	private static String BASE_PATH = "C:/Java/resources/";
	private static String WEB_SERVICES_PATH = BASE_PATH + "webservices.properties";
	
	
	
	private static String STATUS_PATH = BASE_PATH + "status.properties";
	
	private static String driver;
	private static String url;
	private static String user;
	private static String password;
	private static String schemaDTA;
	private static String schemaCTL;
	private static String transactionType;
	private static String metadataSourceXmlFile;
	private static String jpaLogginFile;

	public AppConfig() throws IOException {
		super();
		loadConfigs();
	}

	public static String getWEB_SERVICES_PATH() {
		return WEB_SERVICES_PATH;
	}

	public static void setWEB_SERVICES_PATH(String wEB_SERVICES_PATH) {
		WEB_SERVICES_PATH = wEB_SERVICES_PATH;
	}

	private void loadConfigs() throws IOException {
		InputStream input = new FileInputStream("C:/Java/resources/jdbc.properties");
		//InputStream input = new FileInputStream("C:/Java/resources/jdbc.properties");
		Properties properties = new Properties();
		properties.load(input);

		driver = properties.getProperty("driver").trim();
		url = properties.getProperty("url").trim();
		user = properties.getProperty("user").trim();
		password = properties.getProperty("password").trim();
		schemaDTA = properties.getProperty("schemaDTA").trim();
		schemaCTL = properties.getProperty("schemaCTL").trim();
		transactionType = properties.getProperty("transactionType").trim();
		metadataSourceXmlFile = properties.getProperty("metadataSourceXmlFile").trim();
		jpaLogginFile = properties.getProperty("jpaLogginFile").trim();

	}

	public static String getDriver() {
		return driver;
	}

	public static void setDriver(String driver) {
		AppConfig.driver = driver;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url) {
		AppConfig.url = url;
	}

	public static String getUser() {
		return user;
	}

	public static void setUser(String user) {
		AppConfig.user = user;
	}

	public static String getPassword() {
		return password;
	}

	public static void setPassword(String password) {
		AppConfig.password = password;
	}

	public static String getSchemaDTA() {
		return schemaDTA;
	}

	public static void setSchemaDTA(String schemaDTA) {
		AppConfig.schemaDTA = schemaDTA;
	}

	public static String getSchemaCTL() {
		return schemaCTL;
	}

	public static void setSchemaCTL(String schemaCTL) {
		AppConfig.schemaCTL = schemaCTL;
	}

	public static String getTransactionType() {
		return transactionType;
	}

	public static void setTransactionType(String transactionType) {
		AppConfig.transactionType = transactionType;
	}

	public static String getMetadataSourceXmlFile() {
		return metadataSourceXmlFile;
	}

	public static void setMetadataSourceXmlFile(String metadataSourceXmlFile) {
		AppConfig.metadataSourceXmlFile = metadataSourceXmlFile;
	}

	public static String getJpaLogginFile() {
		return jpaLogginFile;
	}

	public static void setJpaLogginFile(String jpaLogginFile) {
		AppConfig.jpaLogginFile = jpaLogginFile;
	}

	public static String getSTATUS_PATH() {
		return STATUS_PATH;
	}

	public static void setSTATUS_PATH(String sTATUS_PATH) {
		STATUS_PATH = sTATUS_PATH;
	}
}
