package com.briup.app.estore.bean;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Order {
    private Integer id;

    private Double cost;

    private Date orderdate;

    private Customer customer;
    
    private Set<Orderline> orderLines;
    

    public Set<Orderline> getOrderLines() {
    	if(orderLines == null) {
    		orderLines = new HashSet<Orderline>();
    	}
		return orderLines;
	}

	public void setOrderLines(Set<Orderline> orderLines) {
		this.orderLines = orderLines;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}