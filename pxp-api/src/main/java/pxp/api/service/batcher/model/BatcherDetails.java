package pxp.api.service.batcher.model;

public class BatcherDetails {

	public BatcherDetails() {

	}

	private String batcherStatus;

	public String getBatcherStatus() {
		return batcherStatus;
	}

	public void setBatcherStatus(String batcherStatus) {
		this.batcherStatus = batcherStatus;
	}

	@Override
	public String toString() {
		return "BatcherDetails [batcherStatus=" + batcherStatus + "]";
	}

}
