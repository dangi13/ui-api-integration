package pxp.api.service.search.model.electronics;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes {
	public String sourceCode;
	public String buymoreIndicator;
	public String firstATSDate;
	public String salesDivCode;
	public String fauxCategoryCodes;
	public String manstopIQVC;
	public String manstopInternet;
	public String moreColorsAvailable;
	public String displayImageUrl;
	public String lastOnAirDate;
	public String moreOptionsAvailable;
	public String imgColorUrl;
	@JsonProperty("BestSeller")
	public String bestSeller;
	@JsonProperty("SoldLast30DaysQuantity")
	public String soldLast30DaysQuantity;

	public String getSourceCode() {
		return sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getBuymoreIndicator() {
		return buymoreIndicator;
	}

	public void setBuymoreIndicator(String buymoreIndicator) {
		this.buymoreIndicator = buymoreIndicator;
	}

	public String getFirstATSDate() {
		return firstATSDate;
	}

	public void setFirstATSDate(String firstATSDate) {
		this.firstATSDate = firstATSDate;
	}

	public String getSalesDivCode() {
		return salesDivCode;
	}

	public void setSalesDivCode(String salesDivCode) {
		this.salesDivCode = salesDivCode;
	}

	public String getFauxCategoryCodes() {
		return fauxCategoryCodes;
	}

	public void setFauxCategoryCodes(String fauxCategoryCodes) {
		this.fauxCategoryCodes = fauxCategoryCodes;
	}

	public String getManstopIQVC() {
		return manstopIQVC;
	}

	public void setManstopIQVC(String manstopIQVC) {
		this.manstopIQVC = manstopIQVC;
	}

	public String getManstopInternet() {
		return manstopInternet;
	}

	public void setManstopInternet(String manstopInternet) {
		this.manstopInternet = manstopInternet;
	}

	public String getMoreColorsAvailable() {
		return moreColorsAvailable;
	}

	public void setMoreColorsAvailable(String moreColorsAvailable) {
		this.moreColorsAvailable = moreColorsAvailable;
	}

	public String getDisplayImageUrl() {
		return displayImageUrl;
	}

	public void setDisplayImageUrl(String displayImageUrl) {
		this.displayImageUrl = displayImageUrl;
	}

	public String getLastOnAirDate() {
		return lastOnAirDate;
	}

	public void setLastOnAirDate(String lastOnAirDate) {
		this.lastOnAirDate = lastOnAirDate;
	}

	public String getMoreOptionsAvailable() {
		return moreOptionsAvailable;
	}

	public void setMoreOptionsAvailable(String moreOptionsAvailable) {
		this.moreOptionsAvailable = moreOptionsAvailable;
	}

	public String getImgColorUrl() {
		return imgColorUrl;
	}

	public void setImgColorUrl(String imgColorUrl) {
		this.imgColorUrl = imgColorUrl;
	}

	public String getBestSeller() {
		return bestSeller;
	}

	public void setBestSeller(String bestSeller) {
		this.bestSeller = bestSeller;
	}

	public String getSoldLast30DaysQuantity() {
		return soldLast30DaysQuantity;
	}

	public void setSoldLast30DaysQuantity(String soldLast30DaysQuantity) {
		this.soldLast30DaysQuantity = soldLast30DaysQuantity;
	}

	@Override
	public String toString() {
		return "Attributes [sourceCode=" + sourceCode + ", buymoreIndicator=" + buymoreIndicator + ", firstATSDate="
				+ firstATSDate + ", salesDivCode=" + salesDivCode + ", fauxCategoryCodes=" + fauxCategoryCodes
				+ ", manstopIQVC=" + manstopIQVC + ", manstopInternet=" + manstopInternet + ", moreColorsAvailable="
				+ moreColorsAvailable + ", displayImageUrl=" + displayImageUrl + ", lastOnAirDate=" + lastOnAirDate
				+ ", moreOptionsAvailable=" + moreOptionsAvailable + ", imgColorUrl=" + imgColorUrl + ", bestSeller="
				+ bestSeller + ", soldLast30DaysQuantity=" + soldLast30DaysQuantity + "]";
	}

}
