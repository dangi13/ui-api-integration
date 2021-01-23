package pxp.api.service.user;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pxp.api.utils.common.DbConnector;

public class UserDbService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserDbService.class);
	public static Connection con;

	static {
		con = DbConnector.getDbConnection();
	}
	
	/** It will return the count of records after a certain timeStamp
	 * @return Map : [e.g {C_ID=CHN, borderCount=15}]
	 */
	public static long getBatcherRecordCount() {
		String query = "SELECT COUNT(*) AS recordCount FROM payment where customer_id = 3 and payment_date > 2005-06-17 05:15:15";
		long recordCount = 0L;
		try {
			ResultSet rs = con.createStatement().executeQuery(query);
			rs.next();
			recordCount = Long.valueOf(rs.getString("recordCount"));
		} catch (SQLException e) {
			LOGGER.info("Error while executing query : " + e.getMessage());
		}

		return recordCount;
	}
}
