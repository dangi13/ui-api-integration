package pxp.api.service.search.model.electronics;

import java.util.List;

public class Pricing {
	public double currentMinimumSellingPrice;
	public double currentMaximumSellingPrice;
	public double qvcMinimumPrice;
	public double qvcMaximumPrice;
	public SpecialPriceType specialPriceType;
	public List<ProductCreditTerm> productCreditTerms;
	public boolean supressQvcPriceIndicator;
	public double retailMinimumPrice;
	public double retailMaximumPrice;

	public double getCurrentMinimumSellingPrice() {
		return currentMinimumSellingPrice;
	}

	public void setCurrentMinimumSellingPrice(double currentMinimumSellingPrice) {
		this.currentMinimumSellingPrice = currentMinimumSellingPrice;
	}

	public double getCurrentMaximumSellingPrice() {
		return currentMaximumSellingPrice;
	}

	public void setCurrentMaximumSellingPrice(double currentMaximumSellingPrice) {
		this.currentMaximumSellingPrice = currentMaximumSellingPrice;
	}

	public double getQvcMinimumPrice() {
		return qvcMinimumPrice;
	}

	public void setQvcMinimumPrice(double qvcMinimumPrice) {
		this.qvcMinimumPrice = qvcMinimumPrice;
	}

	public double getQvcMaximumPrice() {
		return qvcMaximumPrice;
	}

	public void setQvcMaximumPrice(double qvcMaximumPrice) {
		this.qvcMaximumPrice = qvcMaximumPrice;
	}

	public SpecialPriceType getSpecialPriceType() {
		return specialPriceType;
	}

	public void setSpecialPriceType(SpecialPriceType specialPriceType) {
		this.specialPriceType = specialPriceType;
	}

	public List<ProductCreditTerm> getProductCreditTerms() {
		return productCreditTerms;
	}

	public void setProductCreditTerms(List<ProductCreditTerm> productCreditTerms) {
		this.productCreditTerms = productCreditTerms;
	}

	public boolean isSupressQvcPriceIndicator() {
		return supressQvcPriceIndicator;
	}

	public void setSupressQvcPriceIndicator(boolean supressQvcPriceIndicator) {
		this.supressQvcPriceIndicator = supressQvcPriceIndicator;
	}

	public double getRetailMinimumPrice() {
		return retailMinimumPrice;
	}

	public void setRetailMinimumPrice(double retailMinimumPrice) {
		this.retailMinimumPrice = retailMinimumPrice;
	}

	public double getRetailMaximumPrice() {
		return retailMaximumPrice;
	}

	public void setRetailMaximumPrice(double retailMaximumPrice) {
		this.retailMaximumPrice = retailMaximumPrice;
	}

	@Override
	public String toString() {
		return "Pricing [currentMinimumSellingPrice=" + currentMinimumSellingPrice + ", currentMaximumSellingPrice="
				+ currentMaximumSellingPrice + ", qvcMinimumPrice=" + qvcMinimumPrice + ", qvcMaximumPrice="
				+ qvcMaximumPrice + ", specialPriceType=" + specialPriceType + ", productCreditTerms="
				+ productCreditTerms + ", supressQvcPriceIndicator=" + supressQvcPriceIndicator
				+ ", retailMinimumPrice=" + retailMinimumPrice + ", retailMaximumPrice=" + retailMaximumPrice + "]";
	}

}
