package br.com.nfe.file;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.com.nfe.xml.envio.XmlFileEnvioRoot;

public class XMLTransformation {

    private static final Logger LOGGER = Logger.getLogger(XMLTransformation.class.getName());

    public static void setupLogger() {
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao configurar o logger", e);
        }
    }

    public static XmlFileEnvioRoot trasnformXmlToVo(File xmlFile, Class<?> clazz) {
        try {
            
        	JAXBContext contexto = JAXBContext.newInstance(clazz);
        	Unmarshaller unmarshaller = contexto.createUnmarshaller();
        	        	
            return (XmlFileEnvioRoot)unmarshaller.unmarshal(xmlFile); 
        } catch (JAXBException e) {
            LOGGER.log(Level.SEVERE, "Erro ao validar o arquivo de propriedades XML", e);
            return null;
        }
		
    }

}