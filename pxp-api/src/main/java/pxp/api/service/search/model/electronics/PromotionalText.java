package pxp.api.service.search.model.electronics;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PromotionalText {
	@JsonProperty("AUTOPROMOTEXT")
	public List<String> aUTOPROMOTEXT;

	public List<String> getaUTOPROMOTEXT() {
		return aUTOPROMOTEXT;
	}

	public void setaUTOPROMOTEXT(List<String> aUTOPROMOTEXT) {
		this.aUTOPROMOTEXT = aUTOPROMOTEXT;
	}

	@Override
	public String toString() {
		return "PromotionalText [aUTOPROMOTEXT=" + aUTOPROMOTEXT + "]";
	}

}
