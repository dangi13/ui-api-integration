package pxp.api.service.search.model.electronics;

public class Reviews {
	public int count;
	public double averageRating;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public double getAverageRating() {
		return averageRating;
	}

	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
	}

	@Override
	public String toString() {
		return "Reviews [count=" + count + ", averageRating=" + averageRating + "]";
	}

}
