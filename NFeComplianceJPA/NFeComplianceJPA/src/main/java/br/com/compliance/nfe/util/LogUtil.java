package br.com.compliance.nfe.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogUtil {
	
	private static final Logger log = LogManager.getLogger(LogUtil.class.getName());
	
	@SuppressWarnings("unchecked")
	public static void logInfo(Map<String,Object> map, String tabela){
		
		Set<String> chaves = map.keySet();
		
		for(String s : chaves){
			if("query".equalsIgnoreCase(s)){
				log.info("Query: " + map.get(s));
			}else if("parametros".equalsIgnoreCase(s)){				
				List<String> parametros = (List<String>)map.get(s);
				StringBuilder sbParam = new StringBuilder();
				int size = parametros.size();
				int count = 1;
				for(String param : parametros){					
					sbParam.append(param);
					if(size>count){
						sbParam.append(" - ");
					}
					count++;
				}				
				log.info("Parametros: " + sbParam.toString());
			}
		}		
		
	}
	
	public static void logError(Exception ex, String tabela){
		log.error("Erro " + tabela + " - " + ex);
	}

}
