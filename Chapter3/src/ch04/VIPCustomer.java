package ch04;

public class VIPCustomer extends Customer{

	double salesRatio;
	private String agentID;
	
//	public VIPCustomer() {
//		
//		super(0,"no-name");
//		bonusRatio = 0.05;
//		salesRatio = 0.01;
//		customerGrade = "VIP";
//		System.out.println("VIPCustomer() call");
//	}
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
}

	

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}



	public String getAgentID() {
		return agentID;
	}

	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}
	
	

}
