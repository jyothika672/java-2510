package fourteen_polymorphism;

import java.util.Random;

public abstract class AbstractPayment implements Payment{
    //string for transaction id

    private String transactionId;

    //abstract method for specific type of payment
    
    public abstract void processPayment(double amount);

    //generating tracantion id
    public String getTransactionId(){
        Random randamID = new Random();
        transactionId = "TX-ID-"+randamID.nextInt(100000000);
        return transactionId;
    }

    //to generate receipt for all payment methods
    @Override
    public void generateReceipt(String transactionId){
        System.out.println("Receipt Generated for Transaction Id : "+transactionId);
        
    }
}
