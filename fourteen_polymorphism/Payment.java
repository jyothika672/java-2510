package fourteen_polymorphism;

public interface Payment {
    //to process the payment-->amount
    public void processPayment(double amount);
    

    //to generate receipt
    public void generateReceipt(String transactionId);
}
