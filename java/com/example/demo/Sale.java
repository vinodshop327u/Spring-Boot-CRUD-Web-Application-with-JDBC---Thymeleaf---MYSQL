package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sale {

		@Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 	private int id;
		@Column
	    private String item;
		@Column
		private int quantity;
		@Column
		private float amount;
	 
	    protected Sale() {
	    }
	 
	    protected Sale(String item, int quantity, float amount) {
	        this.item = item;
	        this.quantity = quantity;
	        this.amount = amount;
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getItem() {
			return item;
		}

		public void setItem(String item) {
			this.item = item;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}

	     
}
