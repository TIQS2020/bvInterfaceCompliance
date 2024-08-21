package br.com.nfe.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.nfe.file.XMLPathReader;
import br.com.nfe.file.XMLReader;
import br.com.nfe.file.XMLTransformation;
import br.com.nfe.xml.envio.XmlFileEnvioRoot;

public class XmlFileControl {

    private static final Logger logger = Logger.getLogger(XmlFileControl.class.getName());

    public List<XmlFileEnvioRoot> controller() {

        logger.info("Iniciando o processo de controle de arquivos XML.");

        // Pegando o path do arquivo de propriedades com o serviço XMLPathReader
        XMLPathReader reader = new XMLPathReader("config.properties");
        String path = reader.getPath();

        logger.info("Path do arquivo de propriedades: " + path);

        List<XmlFileEnvioRoot> xmlFileList = new ArrayList<>();
        File[] xmlFiles = reader.getXMLFiles();

        if (xmlFiles.length > 0) {
            logger.info(xmlFiles.length + " arquivos XML encontrados.");
            for (File file : xmlFiles) {
                logger.info("Validando arquivo XML: " + file.getName());

                // Validando o XML usando XMLReader 
                if (XMLReader.isValidXML(file)) {
                    logger.info("XML válido: " + file.getName());
                    try {
                    	
                    	// transformando o XML e VO
                        XmlFileEnvioRoot vo = XMLTransformation.trasnformXmlToVo(file, XmlFileEnvioRoot.class);
                        xmlFileList.add(vo);
                        logger.info("Arquivo XML processado com sucesso: " + file.getName());
                    } catch (Exception e) {
                        logger.log(Level.SEVERE, "Erro ao processar o arquivo XML: " + file.getName(), e);
                    }
                } else {
                    logger.warning("Arquivo XML inválido: " + file.getName());
                }
            }
        } else {
            logger.warning("Nenhum arquivo XML encontrado no caminho especificado.");
        }

        logger.info("Processo de controle de arquivos XML concluído.");

        return xmlFileList;
    }
}