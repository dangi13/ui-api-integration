package pxp.api.service.user;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.response.Response;
import pxp.api.model.Endpoint;
import pxp.api.service.user.model.User;
import pxp.api.utils.common.CommonUtils;
import pxp.api.utils.common.XMLConfig;
import pxp.api.utils.http.IRestResponse;
import pxp.api.utils.http.RequestType;
import pxp.api.utils.http.RestClient;
import pxp.api.utils.http.RestResponse;

public class UserService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserDbService.class);
	private static final String BASE_URL = XMLConfig.getConfig("UserService", "url");
	private static String USER_PAYLOAD = "";
	
	private static final Map<String, Endpoint> OPERATIONS = new HashMap<String, Endpoint>() {
		private static final long serialVersionUID = 1L;
		{
		    put("getUser", new Endpoint(BASE_URL + "/users/{id}", RequestType.GET));
			put("createUser", new Endpoint(BASE_URL + "/users", RequestType.POST));
			put("updateUser", new Endpoint(BASE_URL + "/users/{id}", RequestType.PUT));
			put("deleteUser", new Endpoint(BASE_URL + "/users/{id}", RequestType.DELETE));
		}
	};

	public static IRestResponse<User> getUser(String id) {
		Endpoint endpointDetails = OPERATIONS.get("getUser");
		String route = StringUtils.replaceEach(endpointDetails.getRoute(), new String[] { "{id}"}, new String[] {id });
		Response response = RestClient.submitRequest(route, endpointDetails.getRequestType());
		
		return new RestResponse<User>(User.class, response);
	}

	public static IRestResponse<User> createUser(String id, String body) {
		Endpoint endpointDetails = OPERATIONS.get("createUser");
		String route = StringUtils.replaceEach(endpointDetails.getRoute(), new String[] { "{id}"}, new String[] {id });
		Response response = RestClient.submitRequest(route, endpointDetails.getRequestType(), body);
		
		return new RestResponse<User>(User.class, response);
	}
	
	public static IRestResponse<User> updateUser(String id, String body) {
		Endpoint endpointDetails = OPERATIONS.get("updateUser");
		String route = StringUtils.replaceEach(endpointDetails.getRoute(), new String[] { "{id}"}, new String[] {id });
		Response response = RestClient.submitRequest(route, endpointDetails.getRequestType(), body);
		
		return new RestResponse<User>(User.class, response);
	}
	
	public static IRestResponse<User> deleteUser(String id) {
		Endpoint endpointDetails = OPERATIONS.get("deleteUser");
		String route = StringUtils.replaceEach(endpointDetails.getRoute(), new String[] { "{id}"}, new String[] {id });
		Response response = RestClient.submitRequest(route, endpointDetails.getRequestType());
		
		return new RestResponse<User>(User.class, response);
	}
	
	public static void main(String[] args) throws IOException {
		IRestResponse<User> createResponse = getUser("2");
		System.out.println("CREATE status code : " + createResponse.getBody());
		/*
		 * long batcherCount = UserDbService.getBatcherRecordCount();
		 * System.out.println("CREATE status code : " + batcherCount);
		 */
	}
	
	public static String getPayload() throws IOException {
		if (USER_PAYLOAD.isEmpty())
			USER_PAYLOAD =  CommonUtils.readFile(UserService.class.getResourceAsStream("userPayload.json"));
		
		return USER_PAYLOAD;
	}
}
