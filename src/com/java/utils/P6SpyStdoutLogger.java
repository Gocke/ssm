package com.java.utils;

import com.p6spy.engine.spy.appender.StdoutLogger;

public class P6SpyStdoutLogger extends StdoutLogger {
	public void logText(String text) {
		StringBuilder sb = new StringBuilder();
		// ƥ�䵽���һ��|��Ϊ�ָ���
		String[] arrString = text.split("\\|(?![^\\|]*\\|)");
		if (arrString.length > 1) {
			sb.append(arrString[0]);
			// ȥ���һ��������滻���и�ʽ��
			arrString[1] = arrString[1].replaceAll(", ", ",\r\n\t");
			arrString[1] = arrString[1].replaceAll(" values ",
					",\r\nvalues\r\n\t");
			arrString[1] = arrString[1].replaceAll(" from ", "\r\nfrom\r\n\t");
			arrString[1] = arrString[1]
					.replaceAll(" where ", "\r\nwhere\r\n\t");
			arrString[1] = arrString[1].replaceAll(" order by ",
					"\r\norder by\r\n\t");
			arrString[1] = arrString[1].replaceAll(" group by ",
					"\r\ngroup by\r\n\t");
			sb.append("\r\n");
			sb.append(arrString[1]);
			qlog.println(sb.toString());
		} else {
			qlog.println(text);
		}
		arrString = null;
	}
}