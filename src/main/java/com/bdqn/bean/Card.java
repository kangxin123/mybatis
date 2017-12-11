package com.bdqn.bean;

import java.io.Serializable;

public class Card implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 622814348576725095L;

	private String cardId;
	
	private String address;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Card [cardId=" + cardId + ", address=" + address + "]";
	}
	
	
	
}
