package com.increpas.www.dao;

import java.sql.*;
import com.increpas.www.DB.*;
import com.increpas.www.sql.*;
import com.increpas.www.vo.*;

public class MembDao {
	WebDBCP db;
	MembSQL mSQL;
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	MembVO vo;
	
	public MembDao() {
		db = new WebDBCP();
		mSQL = new MembSQL();
	}
	
	// 로그인 데이터베이스 처리 전담 함수
	public int getLoginCnt(String id, String pw) {
		int cnt = 0;
		con = db.getCon();
		String sql = mSQL.getSql(mSQL.SEL_LOGIN_CNT);
		pstmt = db.getPstmt(con, sql);
		
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			rs.next();
			cnt = rs.getInt("cnt");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return cnt;
	}
	
	public MembVO getMemb(String id, String pw) {
		vo = new MembVO();
		con = db.getCon();
		String sql = mSQL.getSql(mSQL.SEL_MEMB);
		pstmt = db.getPstmt(con, sql);
		
		try {
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			rs.next();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return vo;
	}
}