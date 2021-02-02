package pxp.api.service.search.model.electronics;

public class SearchFeatures {
	public boolean hideDidYouMean;
	public boolean hideAutoCorrect;
	public boolean hideResultsListAndGuidedNavigation;
	public boolean hideSearchMessaging;

	public boolean isHideDidYouMean() {
		return hideDidYouMean;
	}

	public void setHideDidYouMean(boolean hideDidYouMean) {
		this.hideDidYouMean = hideDidYouMean;
	}

	public boolean isHideAutoCorrect() {
		return hideAutoCorrect;
	}

	public void setHideAutoCorrect(boolean hideAutoCorrect) {
		this.hideAutoCorrect = hideAutoCorrect;
	}

	public boolean isHideResultsListAndGuidedNavigation() {
		return hideResultsListAndGuidedNavigation;
	}

	public void setHideResultsListAndGuidedNavigation(boolean hideResultsListAndGuidedNavigation) {
		this.hideResultsListAndGuidedNavigation = hideResultsListAndGuidedNavigation;
	}

	public boolean isHideSearchMessaging() {
		return hideSearchMessaging;
	}

	public void setHideSearchMessaging(boolean hideSearchMessaging) {
		this.hideSearchMessaging = hideSearchMessaging;
	}

	@Override
	public String toString() {
		return "SearchFeatures [hideDidYouMean=" + hideDidYouMean + ", hideAutoCorrect=" + hideAutoCorrect
				+ ", hideResultsListAndGuidedNavigation=" + hideResultsListAndGuidedNavigation
				+ ", hideSearchMessaging=" + hideSearchMessaging + "]";
	}

}
