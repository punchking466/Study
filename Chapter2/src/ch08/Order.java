package ch08;

public class Order {
	private  Long orderNum;
	private  int orderDate;
	private  int orderTime;
	private  int price;
	private  int menuNum;

	public Order() {}
	
	public Order(Long orderNum, int menuNum, int price, int orderDate, int orderTime) {
		this.setOrderNum(orderNum);
		this.menuNum = menuNum;
		this.price = price;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
	}
//
//	Long getOrderNum() {
//		return orderNum;
//	}
//
//	public void setOrderNum(Long orderNum) {
//		this.orderNum = orderNum;
//	}

	public Long getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(Long orderNum) {
		this.orderNum = orderNum;
	}

	public int getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(int orderDate) {
		this.orderDate = orderDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(int orderTime) {
		this.orderTime = orderTime;
	}

	public int getMenuNum() {
		return menuNum;
	}

	public void setMenuNum(int menuNum) {
		this.menuNum = menuNum;
	}
	
}
