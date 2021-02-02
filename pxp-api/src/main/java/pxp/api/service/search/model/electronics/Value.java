package pxp.api.service.search.model.electronics;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
public class Value {
	public String navigationState;
	public String navigationStateJson;
	public int count;
	public String name;
	public String refinementId;
	public String categoryId;
	public boolean selected;

	public String getNavigationState() {
		return navigationState;
	}

	public void setNavigationState(String navigationState) {
		this.navigationState = navigationState;
	}

	public String getNavigationStateJson() {
		return navigationStateJson;
	}

	public void setNavigationStateJson(String navigationStateJson) {
		this.navigationStateJson = navigationStateJson;
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

	public String getRefinementId() {
		return refinementId;
	}

	public void setRefinementId(String refinementId) {
		this.refinementId = refinementId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	@Override
	public String toString() {
		return "Value [navigationState=" + navigationState + ", navigationStateJson=" + navigationStateJson + ", count="
				+ count + ", name=" + name + ", refinementId=" + refinementId + ", categoryId=" + categoryId
				+ ", selected=" + selected + "]";
	}

}
