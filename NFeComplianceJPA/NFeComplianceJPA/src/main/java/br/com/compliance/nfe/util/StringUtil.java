package br.com.compliance.nfe.util;



public abstract class StringUtil {
	public static String formatJDECharString(String value, char charToComplete,
			int size, DirectionEnum direction) {

		if (value == null) {
			return value;
		}

		value = value.trim();
		String result = value;
		int diffSize = size - value.length();

		if (diffSize > 0) {
			String temp = "";

			if (direction == DirectionEnum.RIGHT) {
				temp = String.format("%1$-" + size + "s",
						new Object[] { value });
				temp = temp.replace(' ', charToComplete);
			} else if (direction == DirectionEnum.LEFT) {
				temp = String
						.format("%1$" + size + "s", new Object[] { value });
				temp = temp.replace(' ', charToComplete);
			}

			result = temp;
		}
		return result;
	}

	public static String truncateString(String str, int maxlength) {
		if (str == null) {
			return str;
		}
		
		if (maxlength == 0) {
			maxlength = 1;
		}
			
		if (str.length() <= maxlength) {
			return str;
		} else {
			return str.substring(0, maxlength);
		}
	}
}
