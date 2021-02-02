package pxp.api.service.search.model.electronics;

import java.util.List;

public class Refinement {
	public List<Value> values;
	public int count;
	public String name;
	public String multiSelect;
	public ShowMoreIds showMoreIds;

	public List<Value> getValues() {
		return values;
	}

	public void setValues(List<Value> values) {
		this.values = values;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMultiSelect() {
		return multiSelect;
	}

	public void setMultiSelect(String multiSelect) {
		this.multiSelect = multiSelect;
	}

	public ShowMoreIds getShowMoreIds() {
		return showMoreIds;
	}

	public void setShowMoreIds(ShowMoreIds showMoreIds) {
		this.showMoreIds = showMoreIds;
	}

	@Override
	public String toString() {
		return "Refinement [values=" + values + ", count=" + count + ", name=" + name + ", multiSelect=" + multiSelect
				+ ", showMoreIds=" + showMoreIds + "]";
	}

}
