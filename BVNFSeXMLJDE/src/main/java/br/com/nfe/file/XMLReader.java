package br.com.nfe.file;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public class XMLReader {

    public static boolean isValidXML(File xmlFile) {
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFile);
            doc.getDocumentElement().normalize();
            return true; // XML é válido
        } catch (Exception e) {
            e.printStackTrace();
            return false; // XML inválido
        }
    }
    
    /*
     *	public static void main(String[] args) {
    	
    	
    	
    	
        File xmlFile = new File("path/to/your/xmlfile.xml"); //caminho do XML
        if (isValidXML(xmlFile)) {
            System.out.println("XML é válido.");
        } else {
            System.out.println("XML é inválido.");
        }
    } 
     * 
     */

    
}