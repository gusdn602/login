package com.increpas.www.sql;

public class MembSQL {
	public final int SEL_LOGIN_CNT = 1001;
	public final int SEL_MEMB = 1002;
	
	public String getSql(int code) {
		StringBuffer buff = new StringBuffer();
		
		switch(code) {
		case SEL_LOGIN_CNT :
			buff.append("SELECT ");
			buff.append("	COUNT(*) cnt ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			buff.append("	AND pw = ? ");
			break;
		case SEL_MEMB :
			buff.append("SELECT ");
			buff.append("	name, mail, tel ");
			buff.append("FROM ");
			buff.append("	member ");
			buff.append("WHERE ");
			buff.append("	id = ? ");
			buff.append("	AND pw = ? ");
		}
		return buff.toString();
	}
}
