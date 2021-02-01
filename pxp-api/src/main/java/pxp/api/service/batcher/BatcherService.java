package pxp.api.service.batcher;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.restassured.response.Response;
import pxp.api.model.Endpoint;
import pxp.api.service.batcher.model.BatcherDetails;
import pxp.api.utils.common.Config;
import pxp.api.utils.common.XMLConfig;
import pxp.api.utils.http.IRestResponse;
import pxp.api.utils.http.RequestType;
import pxp.api.utils.http.RestClient;
import pxp.api.utils.http.RestResponse;

public class BatcherService {
	private static final Logger LOGGER = LoggerFactory.getLogger(BatcherService.class);
	private static final String BASE_URL = XMLConfig.getConfig("BatcherService", "url");

	private static final Map<String, Endpoint> OPERATIONS = new HashMap<String, Endpoint>() {
		private static final long serialVersionUID = 1L;
		{
		    put("getBatcherStatus", new Endpoint(BASE_URL + "/{region}/batcher/{productNumber}", RequestType.GET));
		}
	};
	
	public static IRestResponse<BatcherDetails> getBatcherStatus(String region, String productNumber) {
		Endpoint endpointDetails = OPERATIONS.get("getBatcherStatus");
		String route = StringUtils.replaceEach(endpointDetails.getRoute(), new String[] { "{region}", "{productNumber}" }, new String[] { region, productNumber });
		Response response = RestClient.submitRequest(route, endpointDetails.getRequestType());
		
		return new RestResponse<>(BatcherDetails.class, response);
	}
}
