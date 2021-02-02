package pxp.api.service.search;

import com.google.gson.Gson;

import io.restassured.path.json.JsonPath;
import pxp.api.service.search.model.electronics.Root;
import pxp.api.service.search.model.electronics.SortBy;
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
		PAYLOAD_JSON = new JsonPath(CommonUtils.readFile(DataSet.class.getResourceAsStream("electronics.json")));
	}
	
	public static void main(String[] args) {
		String jsonString = PAYLOAD_JSON.prettify();
		Gson gson = new Gson();
		Root root= gson.fromJson(jsonString, Root.class);
		for (SortBy sort : root.getNavigation().getSortBy()) {
			System.out.println(sort);
			System.out.println("#############");
		}
	}
}