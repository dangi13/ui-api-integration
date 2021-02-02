package pxp.api.service.search.model.electronics;

import java.util.List;

public class Root {
	public int limit;
	public int numberOfElements;
	public int totalElements;
	public Navigation navigation;
	public SearchFeatures searchFeatures;
	public List<Spotlight> spotlights;
	public List<Product> products;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public int getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}

	public Navigation getNavigation() {
		return navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

	public SearchFeatures getSearchFeatures() {
		return searchFeatures;
	}

	public void setSearchFeatures(SearchFeatures searchFeatures) {
		this.searchFeatures = searchFeatures;
	}

	public List<Spotlight> getSpotlights() {
		return spotlights;
	}

	public void setSpotlights(List<Spotlight> spotlights) {
		this.spotlights = spotlights;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Root [limit=" + limit + ", numberOfElements=" + numberOfElements + ", totalElements=" + totalElements
				+ ", navigation=" + navigation + ", searchFeatures=" + searchFeatures + ", spotlights=" + spotlights
				+ ", products=" + products + "]";
	}

}
