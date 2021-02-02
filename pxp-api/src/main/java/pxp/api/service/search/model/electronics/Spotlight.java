package pxp.api.service.search.model.electronics;

public class Spotlight {
	public String productNumber;
	public String itemNumber;
	public String type;
	public String shortDescription;
	public String availableToSellIndicator;
	public String baseImageUrl;
	public boolean swatchIndicator;
	public Reviews reviews;
	public Pricing pricing;
	public PromotionalText promotionalText;
	public ShippingAndHandling shippingAndHandling;
	public Attributes attributes;

	public String getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(String productNumber) {
		this.productNumber = productNumber;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getAvailableToSellIndicator() {
		return availableToSellIndicator;
	}

	public void setAvailableToSellIndicator(String availableToSellIndicator) {
		this.availableToSellIndicator = availableToSellIndicator;
	}

	public String getBaseImageUrl() {
		return baseImageUrl;
	}

	public void setBaseImageUrl(String baseImageUrl) {
		this.baseImageUrl = baseImageUrl;
	}

	public boolean isSwatchIndicator() {
		return swatchIndicator;
	}

	public void setSwatchIndicator(boolean swatchIndicator) {
		this.swatchIndicator = swatchIndicator;
	}

	public Reviews getReviews() {
		return reviews;
	}

	public void setReviews(Reviews reviews) {
		this.reviews = reviews;
	}

	public Pricing getPricing() {
		return pricing;
	}

	public void setPricing(Pricing pricing) {
		this.pricing = pricing;
	}

	public PromotionalText getPromotionalText() {
		return promotionalText;
	}

	public void setPromotionalText(PromotionalText promotionalText) {
		this.promotionalText = promotionalText;
	}

	public ShippingAndHandling getShippingAndHandling() {
		return shippingAndHandling;
	}

	public void setShippingAndHandling(ShippingAndHandling shippingAndHandling) {
		this.shippingAndHandling = shippingAndHandling;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	@Override
	public String toString() {
		return "Spotlight [productNumber=" + productNumber + ", itemNumber=" + itemNumber + ", type=" + type
				+ ", shortDescription=" + shortDescription + ", availableToSellIndicator=" + availableToSellIndicator
				+ ", baseImageUrl=" + baseImageUrl + ", swatchIndicator=" + swatchIndicator + ", reviews=" + reviews
				+ ", pricing=" + pricing + ", promotionalText=" + promotionalText + ", shippingAndHandling="
				+ shippingAndHandling + ", attributes=" + attributes + "]";
	}

}
