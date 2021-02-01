package pxp.api.service.batcher;

import org.testng.annotations.DataProvider;

import io.restassured.path.json.JsonPath;
import pxp.api.utils.common.CommonUtils;

/**
 * This class contains all the /payload needed for this service.
 * 
 * @author Jaikant Dangi
 *
 */
public class DataSet {

	private static JsonPath PAYLOAD_JSON;

	static {
		PAYLOAD_JSON = new JsonPath(CommonUtils.readFile(BatcherService.class.getResourceAsStream("batcherPayload.json")));
	}

	@DataProvider(name = "productNumbers")
	public Object[][] productNumbers() {

		return PAYLOAD_JSON.getList("dataSet.productNumbers")
						   .stream().map(productNumber -> new Object[] { productNumber })
				           .toArray(Object[][]::new);
	}
}
