package pxp.ui.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pxp.api.service.batcher.BatcherDbService;
import pxp.api.service.batcher.BatcherService;
import pxp.api.service.batcher.DataSet;

public class TestBatcherStatus {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBatcherStatus.class);
	
	@Test(testName = "PXP_01", description = "Test that batcher status is [Test Commplete!]", dataProviderClass = DataSet.class , dataProvider =  "productNumbers")
	public void testBatcherStatusFromAPI(String data) {
		String batcherStatus = BatcherService.getBatcherStatus("us", "G34BVJ5KBK5").getBody().getBatcherStatus();
		Assert.assertEquals(batcherStatus, "Test Complete !");
	}
	
	@Test
	public void testBatcherInDatabase() {
		long batcherCount = BatcherDbService.getBatcherRecordCount("us", "ASJ4BV455J");
		LOGGER.info("Batcher count is : "+ batcherCount);
	}
	
}
