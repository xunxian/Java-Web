package com.example.SystemUtil;

public class SQLiteDBConfig {
	public static final String DBNAME = "test.db";
	public static final int VERSION = 1;
	public static final String CREATE_USER = "CREATE TABLE User(id Integer primary key autoincrement,"
			+ " username text,"
			+ " password text)";
}
