package Polymorphism;

public class Payment {
	void processPayment() {
		System.out.println("Processing generic payment...");
	}
}
default	class CreditcardPayment extends Payment {
		@Override
		void processPayment() {
		System.out.println("Processing creditcard payment...");
		}
}
	class UpiPayment extends Payment {
		@Override
		void processPayment() {
		System.out.println("Processing UPI payment...");
		}
	}	
class PaymentSystem{
	public static void main(String[] args) {
		Payment pay;
		pay = new Payment();
		pay.processPayment();
		
		pay = new CreditcardPayment();
		pay.processPayment();
		
		pay = new UpiPayment();
		pay.processPayment();
	}
}
