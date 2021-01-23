package pxp.api.service.batcher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import pxp.api.utils.common.DbConnector;

/**
 * It contains all the queries and their results stored in expected format.
 * 
 * @author Jaikant
 *
 */
public class BatcherDbService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BatcherDbService.class);
	public static Connection con;

	static {
		con = DbConnector.getDbConnection();
	}

	/**
	 * It will return the count of records after a certain timeStamp
	 * 
	 * @return Map : [e.g {C_ID=CHN, borderCount=15}]
	 */
	public static long getBatcherRecordCount(String countryCode, String productNumber) {
		String query = "SELECT COUNT(*) AS recordCount FROM sakila.payment where countryCode =" + countryCode
				+ " and productNumber =" + productNumber + " and payment_date >= NOW() - INTERVAL 5 SECOND";

		LOGGER.info("Executing query : " + query);
		long recordCount = 0L;
		try {
			ResultSet rs = con.createStatement().executeQuery(query);
			rs.next();
			recordCount = Long.valueOf(rs.getString("recordCount"));
			LOGGER.info("Record count is: " + recordCount);

		} catch (SQLException e) {
			LOGGER.info("Error while executing query : " + e.getMessage());
		}

		return recordCount;
	}
}
