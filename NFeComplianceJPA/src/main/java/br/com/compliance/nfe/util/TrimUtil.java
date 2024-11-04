package br.com.compliance.nfe.util;

import java.lang.reflect.Field;

public class TrimUtil {

    public static void trimStrings(Object obj) {
        // Obtém todas as declarações de campos da classe
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            // Verifica se o campo é do tipo String
            if (field.getType() == String.class) {
                field.setAccessible(true); // Permite acesso a campos privados
                try {
                    String value = (String) field.get(obj);
                    if (value != null) {
                        // Aplica o trim e seta de volta o valor no campo
                        field.set(obj, value.trim());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
