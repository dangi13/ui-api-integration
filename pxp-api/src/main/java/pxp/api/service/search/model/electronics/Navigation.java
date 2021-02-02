package pxp.api.service.search.model.electronics;

import java.util.List;

public class Navigation {
	public List<Refinement> refinements;
	public List<SortBy> sortBy;

	public List<Refinement> getRefinements() {
		return refinements;
	}

	public void setRefinements(List<Refinement> refinements) {
		this.refinements = refinements;
	}

	public List<SortBy> getSortBy() {
		return sortBy;
	}

	public void setSortBy(List<SortBy> sortBy) {
		this.sortBy = sortBy;
	}

	@Override
	public String toString() {
		return "Navigation [refinements=" + refinements + ", sortBy=" + sortBy + "]";
	}

}
