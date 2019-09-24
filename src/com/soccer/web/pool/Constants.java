package com.soccer.web.pool;

import java.sql.DriverManager;

public class Constants {

	public static final String VIEW_PATH = "WEB-INF/views/%s/%s.jsp";
	
	public static final String 	ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:xe" , 
								ORACLE_DRIVER ="oracle.jdbc.OracleDriver",
								
								MARIA_URL = "jdbc:mariadb://localhost:3306" , 
								MARIA_DRIVER ="com.mysql.jdbc.Driver",
								
								MYSQL_URL = "jdbc:mysql://localhost/dev" , 
								MYSQL_DRIVER ="com.mysql.jdbc.Driver",
								
								H2_URL = "jdbc:h2:tcp://ip:port/db" , 
								H2_DRIVER ="org.h2.Driver",
										
								DB2_URL = "jdbc:db2://host:32051" , 
								DB2_DRIVER ="com.ibm.db2.jcc.DB2Driver",
								
								USERNAME = "c##sejong",
								PASSWORD = "7007";
	
	public static final String VENDOR = "oracle";
	
	public static final String VENDOR2 = "mysql";
	
}
