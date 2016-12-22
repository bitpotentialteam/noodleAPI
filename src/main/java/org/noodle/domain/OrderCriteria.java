package org.noodle.domain;

public class OrderCriteria {

	private String orderType;

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	@Override
	public String toString() {
		return "OrderCriteria [orderType=" + orderType + "]";
	}
	
	
	
}
