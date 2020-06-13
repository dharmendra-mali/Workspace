package com.tavant.recipe.modle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@JsonIgnoreProperties({ "hibernateLazyIntitializer", "handler" })

public class Ingredient {

	@Id
	private String ingId;

	private String name;

	private int amount;

	public String getIngId() {
		return ingId;
	}

	public void setIngId(String ingId) {
		this.ingId = ingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
