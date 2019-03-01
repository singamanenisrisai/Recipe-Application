package com.quality.project.datalayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.recipe.common.ApplicationProperties;

/*Singleton Database connector class*/
public class DBConnector {

	public static DBConnector dbConnector = null;

	private DBConnector() {
	}

	public static DBConnector getDBConnectorInstance() {

		if (null == dbConnector) {
			dbConnector = new DBConnector();
		}
		return dbConnector;
	}

	private Connection getDBConnection() {

		Connection connection = null;

		try {
			String databaseURl = ApplicationProperties
					.getProperty("spring.datasource.url");
			String username = ApplicationProperties
					.getProperty("spring.datasource.username");
			String password = ApplicationProperties
					.getProperty("spring.datasource.password");
			Class.forName(ApplicationProperties
					.getProperty("spring.datasource.driver-class-name"));

			connection = DriverManager.getConnection(databaseURl, username,
					password);
		} catch (Exception e) {

		}
		return connection;
	}
	
	public ResultSet executeSQLQuery(String sqlQuery) throws Exception {
		Connection connection = this.getDBConnection();
		ResultSet resultSet = null;
		
		if (connection != null) {
			try {
				Statement statement = connection.createStatement();
				boolean success = statement.execute(sqlQuery);
				if (success) {
					resultSet = statement.getResultSet();
				}
			} catch (Exception e) {
				throw e;
			}
		}
		return resultSet;
	}

}
