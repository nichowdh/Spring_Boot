package com.Spring.JDBC.entity;

import org.springframework.jdbc.core.JdbcTemplate;

public class Jdbc {
	private JdbcTemplate jt; // jdbc template type variable jt

	public Jdbc() {
		super();
	}

	public Jdbc(JdbcTemplate jt) {
		this.jt = jt;
	}

	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public String toString() {
		return "Jdbc [jt=" + jt + "]";
	}

	public void createTable() {
		jt.execute("create table niladri(sid int(11) primary key, sname varchar(22))");
		System.out.println("Table created in MySql....");
	}

}
