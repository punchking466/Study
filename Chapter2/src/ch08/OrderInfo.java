package ch08;

public class OrderInfo {

		Order order = new Order();
		CustomInfo custom = new CustomInfo();
	
		public void ShowOrder() {
			
//			System.out.println("�ֹ� ���� ��ȣ : " + Order.getOrderNum());
			
			System.out.println("==================================");
			System.out.println("�ֹ� ���� ��ȣ : " + order.getOrderNum());
			System.out.println("�ֹ� �ڵ��� ��ȣ : " + custom.getPhoneNum());
			System.out.println("�ֹ� �� �ּ� : " + custom.getAddress());
			System.out.println("�ֹ� ��¥ : " + order.getOrderDate());
			System.out.println("�ֹ� �ð� : " + order.getOrderTime());
			System.out.println("�ֹ� ���� : " + order.getPrice());
			System.out.println("�޴� ��ȣ : " + order.getMenuNum());
			System.out.println("==================================\n\n");
		}
}
