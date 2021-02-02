package pxp.api.service.search.model.electronics;

public class SortBy {
	public String label;
	public boolean selected;
	public String query;
	public String value;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SortBy [label=" + label + ", selected=" + selected + ", query=" + query + ", value=" + value + "]";
	}

}
