package pxp.api.service.search.model.electronics;

public class ProductCreditTerm {
	public int numberOfInstallments;
	public String code;
	public String text;

	public int getNumberOfInstallments() {
		return numberOfInstallments;
	}

	public void setNumberOfInstallments(int numberOfInstallments) {
		this.numberOfInstallments = numberOfInstallments;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "ProductCreditTerm [numberOfInstallments=" + numberOfInstallments + ", code=" + code + ", text=" + text
				+ "]";
	}

}
