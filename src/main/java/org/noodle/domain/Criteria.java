package org.noodle.domain;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class Criteria {

	
	private String searchType;
	private String keyword;
	
	private String brandFilter;
	private String typeFilter;
	private String noodleTypeFilter;
	
	private String orderType;
	
	public String makeQuery(Criteria cri){
		
		UriComponents uriComponents = UriComponentsBuilder.newInstance()
				.queryParam("keyword", keyword)
				.queryParam("brandFilter", brandFilter)
				.queryParam("typeFilter", typeFilter)
				.queryParam("orderType", orderType)
				.build();
		return uriComponents.toUriString();
		
	}

	public String getSearchType() {
		return searchType;
	}

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getBrandFilter() {
		return brandFilter;
	}

	public void setBrandFilter(String brandFilter) {
		this.brandFilter = brandFilter;
	}

	public String getTypeFilter() {
		return typeFilter;
	}

	public void setTypeFilter(String typeFilter) {
		this.typeFilter = typeFilter;
	}

	public String getNoodleTypeFilter() {
		return noodleTypeFilter;
	}

	public void setNoodleTypeFilter(String noodleTypeFilter) {
		this.noodleTypeFilter = noodleTypeFilter;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "Criteria [searchType=" + searchType + ", keyword=" + keyword + ", brandFilter=" + brandFilter
				+ ", typefilter=" + typeFilter + ", noodleTypeFilter=" + noodleTypeFilter + ", orderType=" + orderType
				+ "]";
	}
	
	
}
