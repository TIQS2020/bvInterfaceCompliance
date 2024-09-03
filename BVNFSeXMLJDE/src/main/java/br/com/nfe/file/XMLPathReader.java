package br.com.nfe.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.nfe.util.Operacao;


public class XMLPathReader {

    private static final Logger LOGGER = Logger.getLogger(XMLPathReader.class.getName());
    private String path;    

    public XMLPathReader(String propertiesFilePath, Operacao<?, ?> operacao) {
        loadProperties(propertiesFilePath, operacao);
    }

    private void loadProperties(String propertiesFilePath, Operacao<?, ?> operacao) {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(new File(propertiesFilePath))) {
            properties.load(inputStream);
            if(operacao.getEnvio() != null) {
            	path = properties.getProperty("envioRecebidoXML");        	
            }else if(operacao.getCancelamento() != null) {
            	path = properties.getProperty("cancelamentoRecebidoXML");
            }                   
                        
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar o arquivo de propriedades", e);
        }
    }

    public String getPath() {
        return path;
    }  
    

    public File[] getXMLFiles(String path) {
        if (path != null) {
            File folder = new File(path);
            return folder.listFiles((dir, name) -> name.endsWith(".xml"));
        }
        return new File[0];
    }
    
}
