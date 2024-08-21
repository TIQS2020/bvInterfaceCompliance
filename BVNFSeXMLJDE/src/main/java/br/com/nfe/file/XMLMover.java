package br.com.nfe.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;


public class XMLMover {

    private static final Logger LOGGER = Logger.getLogger(XMLMover.class.getName());

    public static boolean moveFile(File sourceFile, File destFile) { //void
        try {
            Files.move(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Erro ao mover o arquivo: texto a ser definido", e);
            return false;
        }
    }

   /* public static void main(String[] args) {
        XMLPropertiesValidator.setupLogger();

        File sourceFile = new File("path/to/your/xmlpropertiesfile.xml"); // path origem XML
        File destFile = new File("path/to/your/destination/folder/xmlpropertiesfile.xml"); // path destino xml

        if (XMLPropertiesValidator.isValidXMLProperties(sourceFile)) {
            if (moveFile(sourceFile, destFile)) {
                System.out.println("Arquivo movido com sucesso.");
            } else {
                System.out.println("Falha ao mover o arquivo.");
            }
        } else {
            System.out.println("Arquivo de propriedades XML inválido, não pode ser movido.");
        }
    }*/
}
