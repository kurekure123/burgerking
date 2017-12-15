package com.kiosk.burgerking.storebeam;

public class StoreBean {
	private String menu, price, money, takeout, count;

	
	public void setMoney(String money) {
		this.money = money;
	}
	public String getMoney() {
		return money;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPrice() {
		return price;
	}
	
	public void setMenu(String menu) {
		this.menu = menu;
	}
	
	public String getMenu() {
		return menu;
	}
	public void setTakeout(String takeout) {
		this.takeout = takeout;
	}
	public String getTakeout() {
		return takeout;
	}
	
	public void setCount(String count) {
		this.count = count;
	}
	public String getCount() {
		return count;
	}
}
