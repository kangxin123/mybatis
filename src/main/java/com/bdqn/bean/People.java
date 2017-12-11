package com.bdqn.bean;

import java.io.Serializable;

public class People implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8047236710146787057L;

	private String peopleId;
	
	private String peopleName;
	
	private Card card;

	public String getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}

	public String getPeopleName() {
		return peopleName;
	}

	public void setPeopleName(String peopleName) {
		this.peopleName = peopleName;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "People [peopleId=" + peopleId + ", peopleName=" + peopleName + ", card=" + card + "]";
	}
	
	
	
}
