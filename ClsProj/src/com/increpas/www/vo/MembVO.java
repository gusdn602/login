package com.increpas.www.vo;

import java.sql.*;
import java.text.*;

public class MembVO {
	private int mno, ano;
	private String name, id, pw, mail, tel, joindate;
	private char gen, isshow;
	private Date jdate;
	private Time jtime;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate() {
		SimpleDateFormat jdate = new SimpleDateFormat("YYYY/MM/dd");
		SimpleDateFormat jtime = new SimpleDateFormat("hh/mm");
		String joindate = jdate + "" + jtime;
		this.joindate = joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
	public char getIsshow() {
		return isshow;
	}
	public void setIsshow(char isshow) {
		this.isshow = isshow;
	}
	
}
