package com.Spring.JDBC.Spring_JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.JDBC.entity.Jdbc;

public class SpringJdbcApplication {

	public static void main(String[] args) {
		System.out.println("_______in Main________");
		ApplicationContext app = new ClassPathXmlApplicationContext("Niladri.xml");
		Jdbc mb = (Jdbc) app.getBean("mb2");
		mb.createTable();

	}

}
