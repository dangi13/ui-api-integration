package pxp.api.service.search.model.electronics;

public class ShippingAndHandling {
	public double shippingHandlingCharge;
	public String discountCode;
	public boolean twoManHandling;

	public double getShippingHandlingCharge() {
		return shippingHandlingCharge;
	}

	public void setShippingHandlingCharge(double shippingHandlingCharge) {
		this.shippingHandlingCharge = shippingHandlingCharge;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public boolean isTwoManHandling() {
		return twoManHandling;
	}

	public void setTwoManHandling(boolean twoManHandling) {
		this.twoManHandling = twoManHandling;
	}

	@Override
	public String toString() {
		return "ShippingAndHandling [shippingHandlingCharge=" + shippingHandlingCharge + ", discountCode="
				+ discountCode + ", twoManHandling=" + twoManHandling + "]";
	}

}
