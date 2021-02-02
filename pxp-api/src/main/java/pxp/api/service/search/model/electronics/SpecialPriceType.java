package pxp.api.service.search.model.electronics;

public class SpecialPriceType {
	public Object code;
	public Object description;
	public Object specialPriceStartTime;
	public Object specialPriceEndTime;
	public Object specialPricePopupUrl;

	public Object getCode() {
		return code;
	}

	public void setCode(Object code) {
		this.code = code;
	}

	public Object getDescription() {
		return description;
	}

	public void setDescription(Object description) {
		this.description = description;
	}

	public Object getSpecialPriceStartTime() {
		return specialPriceStartTime;
	}

	public void setSpecialPriceStartTime(Object specialPriceStartTime) {
		this.specialPriceStartTime = specialPriceStartTime;
	}

	public Object getSpecialPriceEndTime() {
		return specialPriceEndTime;
	}

	public void setSpecialPriceEndTime(Object specialPriceEndTime) {
		this.specialPriceEndTime = specialPriceEndTime;
	}

	public Object getSpecialPricePopupUrl() {
		return specialPricePopupUrl;
	}

	public void setSpecialPricePopupUrl(Object specialPricePopupUrl) {
		this.specialPricePopupUrl = specialPricePopupUrl;
	}

	@Override
	public String toString() {
		return "SpecialPriceType [code=" + code + ", description=" + description + ", specialPriceStartTime="
				+ specialPriceStartTime + ", specialPriceEndTime=" + specialPriceEndTime + ", specialPricePopupUrl="
				+ specialPricePopupUrl + "]";
	}

}
