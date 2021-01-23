package pxp.ui.tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import pxp.api.service.batcher.BatcherDbService;
import pxp.api.service.batcher.BatcherService;
import pxp.api.service.user.UserDbService;
import pxp.api.service.user.UserService;

public class TestBatcherStatus {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestBatcherStatus.class);
	
	@Test
	public void testBatcherStatusFromAPI() {
		String batcherStatus = BatcherService.getBatcherStatus("us", "G34BVJ5KBK5").getBody().getBatcherStatus();
		Assert.assertEquals(batcherStatus, "Test Complete !");
	}
	
	@Test
	public void testBatcherInDatabase() {
		long batcherCount = BatcherDbService.getBatcherRecordCount("us", "ASJ4BV455J");
		LOGGER.info("Batcher count is : "+ batcherCount);
	}
	
}
