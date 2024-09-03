package br.com.nfe.file;

import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.logging.Level;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import br.com.nfe.xml.envio.XmlFileEnvioRoot;

public class XMLTransformation<T> {

	private final Class<T> type;

    public XMLTransformation(Class<T> type) {
        this.type = type;
    }

    public String toXml(T object) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(type);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        StringWriter sw = new StringWriter();
        marshaller.marshal(object, sw);
        return sw.toString();
    }

    public T fromXml(File xmlFile) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(type);
        Unmarshaller unmarshaller = context.createUnmarshaller();  
        return (T)unmarshaller.unmarshal(xmlFile);        
    }

    
    /*
    public static XmlFileEnvioRoot transformXmlToVo(File xmlFile, Class<?> clazz) {
        try {
            
        	JAXBContext contexto = JAXBContext.newInstance(clazz);
        	Unmarshaller unmarshaller = contexto.createUnmarshaller();
        	        	
            return (XmlFileEnvioRoot)unmarshaller.unmarshal(xmlFile); 
        } catch (JAXBException e) {
            LOGGER.log(Level.SEVERE, "Erro ao validar o arquivo de propriedades XML", e);
            return null;
        }
		
    }*/

}