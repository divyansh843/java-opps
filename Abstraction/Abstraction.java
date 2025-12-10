package Opps.Abstraction;

abstract class Payment {
    double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();

    public void paymentInfo() {
        System.out.println("Payment amount: ₹" + amount);
    }
}


class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Processing credit card payment of ₹" + amount);
    }
}

class UPIPayment extends Payment {
    public UPIPayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Processing UPI payment of ₹" + amount);
    }
}

class PayPalPayment extends Payment {
    public PayPalPayment(double amount) {
        super(amount);
    }

    void processPayment() {
        System.out.println("Processing PayPal payment of ₹" + amount);
    }
}




public class Abstraction {
    public static void main(String[] args) {
        Payment credit = new CreditCardPayment(500.0);
        Payment upi = new UPIPayment(500.0);
        Payment paypal = new PayPalPayment(500.0);

        credit.processPayment();
        upi.processPayment();
        paypal.processPayment();
    }
    
    
}
