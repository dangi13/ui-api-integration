package pxp.api.test.batcher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import pxp.api.listeners.ExtentReporter;
import pxp.api.service.batcher.BatcherDbService;
import pxp.api.service.batcher.BatcherService;
import pxp.api.service.batcher.DataSet;
import pxp.api.service.batcher.model.BatcherDetails;
import pxp.api.utils.http.IRestResponse;

public class BatcherTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(BatcherTest.class);

	
	@Test(testName = "PXP_01", description = "Test that batcher status is [Test Commplete!]", dataProviderClass = DataSet.class , dataProvider =  "productNumbers")
	public void testGetBatcherMessage(String productNumber) {
		ExtentReporter.info("Getting batcher info");
		System.out.println("Product number is: " + productNumber);
		IRestResponse<BatcherDetails> batcherDetails = BatcherService.getBatcherStatus("us", productNumber);
		LOGGER.info("Batcher detail is : ", batcherDetails.getContent());
	}

	 @Test(testName = "PXP_02", description = "Test that batcher updated in database")
	public void testBatcherInDb() {
		ExtentReporter.info("Searching batcher in database");
		long batcherCount = BatcherDbService.getBatcherRecordCount("us", "GJD4MJE6JHBND");
		ExtentReporter.info("Batcher count in database is: "+ batcherCount);

	}

}
