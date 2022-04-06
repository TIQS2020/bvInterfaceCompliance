package br.com.compliance.nfe.dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractDatabaseHandler<T>  {
	
	protected Class<T> type;
	// protected final String query;

	protected AbstractDatabaseHandler(Class<T> type) {
		this.type = type;
		// this.query = createQuery();
	}

	//protected abstract String createQuery();

	protected String getColumns(boolean usePlaceHolders, String prefix) {
		StringBuilder sb = new StringBuilder();

		boolean first = true;
		for (Field f : type.getDeclaredFields()) {
			if (first)
				first = false;
			else
				sb.append(", ");

			if (usePlaceHolders)
				sb.append("?");
			else
				sb.append(prefix + f.getName());
		}

		return sb.toString();
	}

	protected List<T> getResultSetObject(ResultSet resultSet) throws SecurityException, IllegalArgumentException, SQLException,
			InstantiationException, IllegalAccessException, IntrospectionException, InvocationTargetException {

		List<T> list = new ArrayList<T>();

		while (resultSet.next()) {

			T instance = type.newInstance();

			for (Field field : type.getDeclaredFields()) {
				field.setAccessible(true);
				Object value = resultSet.getObject(field.getName());				

				PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), type);

				Method method = propertyDescriptor.getWriteMethod();
				
				method.invoke(instance, value);		
				
			}

			list.add(instance);
		}
		return list;
	}

}
