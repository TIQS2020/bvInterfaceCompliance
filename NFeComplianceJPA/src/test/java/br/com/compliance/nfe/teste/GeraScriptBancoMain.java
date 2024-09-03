package br.com.compliance.nfe.teste;

import javax.persistence.EntityManager;

import br.com.compliance.nfe.jpa.EntityManagerHelper;

public class GeraScriptBancoMain {

	public static void exportSchema(String outputFilePath) {

		EntityManager manager = EntityManagerHelper.getEntityManager();

        try {
            
            System.out.println("Script SQL exportado com sucesso para: " + outputFilePath);
        } finally {
        	manager.close();            
        }
    }

    public static void main(String[] args) {        
        String outputFilePath = "schema.sql";
        exportSchema(outputFilePath);
    }

}
