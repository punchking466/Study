package ch08;

public class OrderMain {

	public static void main(String[] args) {
		
		Order order1 = new Order(202011020003L, 0003, 35000, 20201102, 130258);
		CustomInfo custom1 = new CustomInfo();
		OrderInfo orderInfo1 = new OrderInfo();
		
		custom1.CustomInfo(37, 180, 78, "Tomas", "01023450001", "서울시 강남구 역삼동 111-333");
		
		orderInfo1.ShowOrder();
		
		Order order2 = new Order(302011020003L, 0017, 12000, 20201102, 140357);
		CustomInfo custom2 = new CustomInfo();
		
		custom2.CustomInfo(21, 170, 12, "James", "01023450001", "전라북도 전주");
		
		
		OrderInfo orderInfo2 = new OrderInfo();
		
		orderInfo2.ShowOrder();
	}
}
