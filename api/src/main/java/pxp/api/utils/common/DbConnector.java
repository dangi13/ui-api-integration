package pxp.api.utils.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pxp.api.utils.common.Config;


/** This class is responsible for making database connection.
 * @author Jaikant Dangi
 *
 */
public class DbConnector {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DbConnector.class);
	private static Connection con;

	public static Connection getDbConnection() {
		if (Objects.isNull(con)) {
			try {
				Class.forName(Config.getProperty("dbClass")).newInstance();
				con = DriverManager.getConnection(Config.getProperty("dbURL"), Config.getProperty("dbUser"), Config.getProperty("dbPassword"));
				LOGGER.info("Connection established with DB");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return con;
	}

}
