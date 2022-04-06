package br.com.compliance.nfe.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;

public abstract class AbstractDatabaseHandler<T> {

	protected Class<T> type;
	// protected final String query;

	protected AbstractDatabaseHandler(Class<T> type) {
		this.type = type;
		// this.query = createQuery();
	}

	//protected abstract String createQuery();

	protected String getColumns(boolean usePlaceHolders) {
		StringBuilder sb = new StringBuilder();

		boolean first = true;
		for (Field f : type.getDeclaredFields()) {
			if (first)
				first = false;
			else
				sb.append(", ");
			if(!"id".equalsIgnoreCase(f.getName()))
				if (usePlaceHolders)
					sb.append("?");
				else
					sb.append(f.getName());
			else
				first = true;
		}

		return sb.toString();
	}
	
	protected void setPreparedStatement(PreparedStatement st, Object object) {	
			
		try{
			Method setObject = PreparedStatement.class.getMethod("setObject", int.class, Object.class);
			int num = 1;
			for (Field field : object.getClass().getDeclaredFields()) {
				field.setAccessible(true);
				
				Object[] pstmtParams = null;
				
				if(!"id".equalsIgnoreCase(field.getName())){
					if(field.getType() == Double.class){					
						pstmtParams = new Object[]{new Integer(num), (Double)field.get(object)};
					}else if(field.getType() == String.class){					
						pstmtParams = new Object[]{new Integer(num), (String)field.get(object)};
					}else if(field.getType() == Long.class){
						pstmtParams = new Object[]{new Integer(num), (Long)field.get(object)};
					}		
					  
					setObject.invoke(st, pstmtParams);
					num++;
				}
						
			}		
			st.executeUpdate();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
}
