package br.com.nfe.control;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import br.com.nfe.file.XMLMover;
import br.com.nfe.file.XMLPathReader;
import br.com.nfe.file.XMLReader;
import br.com.nfe.file.XMLTransformation;
import br.com.nfe.util.Operacao;
import br.com.nfe.vo.ArquivoVo;
import br.com.nfe.xml.cancelamento.XmlFileCancelamentoRoot;
import br.com.nfe.xml.envio.XmlFileEnvioRoot;

public class XmlFileControl {

    private static final Logger logger = Logger.getLogger(XmlFileControl.class.getName());

    public List<ArquivoVo> xmlTransformToObject(Operacao<?,?> operacao) {

        logger.info("Iniciando o processo de controle de arquivos XML.");

        // Pegando o path do arquivo de propriedades com o serviço XMLPathReader
        XMLPathReader reader = new XMLPathReader("c:/Java/resources/webservices.properties", operacao);
        String path = reader.getPath();
        
        XmlFileEnvioRoot envioVo = null;
        XmlFileCancelamentoRoot cancelamentoVo = null;        
        List<ArquivoVo> arquivoVolist = new ArrayList<>();
        
        logger.info("Path do arquivo de propriedades: " + path);
        
        File[] xmlFiles = reader.getXMLFiles(path);

        if (xmlFiles.length > 0) {
            logger.info(xmlFiles.length + " arquivos XML encontrados.");
            for (File file : xmlFiles) {
                logger.info("Validando arquivo XML: " + file.getName());
                ArquivoVo arquivoVo = new ArquivoVo();

                // Validando o XML usando XMLReader 
                if (XMLReader.isValidXML(file)) {
                    logger.info("XML válido: " + file.getName());
                    arquivoVo.setNome(file.getName());
                    arquivoVo.setPath(path);
                    try {                    	
                    	// transformando o Arquivo XML em objeto
                    	 if(operacao.getEnvio() != null) {
                    		 XMLTransformation<XmlFileEnvioRoot> envioConverter = new XMLTransformation<>(XmlFileEnvioRoot.class);
                    		 envioVo = envioConverter.fromXml(file);
                    		 arquivoVo.setXmlFileEnvioRoot(envioVo);
                         }else if(operacao.getCancelamento() != null) {
                        	 XMLTransformation<XmlFileCancelamentoRoot> cancelamentoConverter = new XMLTransformation<>(XmlFileCancelamentoRoot.class);
                        	 cancelamentoVo = cancelamentoConverter.fromXml(file);
                        	 arquivoVo.setXmlFileCancelamentoRoot(cancelamentoVo);
                        	 
                         }                                               
                        
                        logger.info("Arquivo XML processado com sucesso: " + file.getName());
                    } catch (Exception e) {
                        logger.log(Level.SEVERE, "Erro ao processar o arquivo XML: " + file.getName(), e);
                    }
                } else {
                    logger.warning("Arquivo XML inválido: " + file.getName());
                }
                
                arquivoVolist.add(arquivoVo);
                
            }
        } else {
            logger.warning("Nenhum arquivo XML encontrado no caminho especificado.");
        }

        logger.info("Processo de controle de arquivos XML concluído.");

        return arquivoVolist;
    }
    
    public void moveFile(String source, String dest) {
        File sourceFile = new File(source);
        File destFile = new File(dest);
    	XMLMover.moveFile(sourceFile, destFile);
    }
}