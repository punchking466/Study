package ch08;

public class OrderInfo {

		Order order = new Order();
		CustomInfo custom = new CustomInfo();
	
		public void ShowOrder() {
			
//			System.out.println("주문 접수 번호 : " + Order.getOrderNum());
			
			System.out.println("==================================");
			System.out.println("주문 접수 번호 : " + order.getOrderNum());
			System.out.println("주문 핸드폰 번호 : " + custom.getPhoneNum());
			System.out.println("주문 집 주소 : " + custom.getAddress());
			System.out.println("주문 날짜 : " + order.getOrderDate());
			System.out.println("주문 시간 : " + order.getOrderTime());
			System.out.println("주문 가격 : " + order.getPrice());
			System.out.println("메뉴 번호 : " + order.getMenuNum());
			System.out.println("==================================\n\n");
		}
}
