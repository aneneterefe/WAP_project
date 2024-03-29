package edu.miu.goldendomemarket.domain;
/** 
* @author Anene Terefe
* @author Hanna Workneh
* created April, 2020
*/ 
public class Item {

	private Integer itemId;
	private String itemName;
	private Double itemPrice;
	private String itemDescription;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(Integer itemId, String itemName, Double itemPrice, String itemDescription) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDescription = itemDescription;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemDescription="
				+ itemDescription + "]";
	}
	
	
}
