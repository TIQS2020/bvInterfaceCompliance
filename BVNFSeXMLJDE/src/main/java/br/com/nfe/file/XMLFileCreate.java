package br.com.nfe.file;

import br.com.nfe.xml.envio.XmlFileEnvioRoot;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

public class XMLFileCreate {

    private static final Logger LOGGER = Logger.getLogger(XMLFileCreate.class.getName());

    public static <T> boolean createXMLFile(T object, String filePath, Class classe){

        try {
            JAXBContext context =  JAXBContext.newInstance(classe);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            marshaller.marshal(object, new File(filePath));
            return true;
        } catch (JAXBException e) {
            LOGGER.log(Level.SEVERE, "Erro ao criar o arquivo: "+filePath+" - ", e);
            return false;
        }

    }
}
