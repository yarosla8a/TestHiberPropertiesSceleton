package org.itstep.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name ="goods")
public class Good {
	@Id
	@Column(name = "asin", length = 300)
	private String  asin;
	
	@Column(name ="name")
	private String name;
	
	@Column(name="price")
	private Integer price;
	
public Good() {
}

public Good(String asin, String name, Integer price) {
	this.asin = asin;
	this.name = name;
	this.price = price;
}
	
}
