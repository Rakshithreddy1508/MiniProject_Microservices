package com.Lulu.MiniProject_SportsProduct.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table //(name = "Sports_products")
public class SportsProducts {

	@Id //Primary Key
	int id;
	String name;
	float cost;
	String descp;


	@Override
	public int hashCode() {
		return java.util.Objects.hash(cost, descp, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SportsProducts other = (SportsProducts) obj;
		return Float.floatToIntBits(cost) == Float.floatToIntBits(other.cost)
				&& java.util.Objects.equals(descp, other.descp) && id == other.id
				&& java.util.Objects.equals(name, other.name);
	}


	public int getId() {
		return id;
	}


	public void setId(long id2) {
		this.id = (int) id2;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	public String getDescp() {
		return descp;
	}


	public void setDescp(String descp) {
		this.descp = descp;
	}


	@Override
	public String toString() {
		return "SportsProducts [id=" + id + ", name=" + name + ", cost=" + cost + ", descp=" + descp + "]";
	}


	public SportsProducts() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SportsProducts(int id, String name, float cost, String descp) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.descp = descp;
	}
}