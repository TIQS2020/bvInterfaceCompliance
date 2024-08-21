package br.com.nfe.file;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;


public class XMLPathReader {

    private static final Logger LOGGER = Logger.getLogger(XMLPathReader.class.getName());
    private String path;

    public XMLPathReader(String propertiesFilePath) {
        loadProperties(propertiesFilePath);
    }

    private void loadProperties(String propertiesFilePath) {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(new File(propertiesFilePath))) {
            properties.load(inputStream);
            path = properties.getProperty("endereço XML");
            if (path == null) {
                LOGGER.log(Level.SEVERE, "XMLpath não foi encontrada no arquivo de propriedades");
            }
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao carregar o arquivo de propriedades", e);
        }
    }

    public String getPath() {
        return path;
    }

    public File[] getXMLFiles() {
        if (path != null) {
            File folder = new File(path);
            return folder.listFiles((dir, name) -> name.endsWith(".xml"));
        }
        return new File[0];
    }
    
}
