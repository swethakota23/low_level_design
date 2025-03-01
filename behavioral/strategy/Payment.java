package behavioral.strategy;

public class Payment {
    public static void main(String[] args) {
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876");
        PaymentStrategy payPalPayment = new PayPalPayment("example@gmail.com");
       

        PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
        processor.processPayment(100);  // Using Credit Card


        System.out.println("*****");
        processor.setPaymentStrategy(payPalPayment);
        processor.processPayment(200);  // Using PayPal

    }
}
