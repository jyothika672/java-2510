package fourteen_polymorphism;
//Overloading 
public class PaymentProcessor {

    //make payment for net banking
    public void makePayment(double amount,String bankName){
        System.out.println("========= Net Banking Payment ========");
        NetBanking nb = new NetBanking(); 
        System.out.println("Amount to Pay: "+amount);
        nb.processPayment(amount);
        nb.generateReceipt(nb.getTransactionId());
    }

    //make payment for credit card
    public void makePayment(double amount,int cardNumber){
        System.out.println("========= Credit Card Payment =========");
        CreditCardPayment cc = new CreditCardPayment();
        cc.processPayment(amount);
        cc.generateReceipt(cc.getCardNumber());
    }

    //make payment for upi
    public void makePayment(double amount,String upiId,String upiPaymentType){
        System.out.println("========= UPI Payment =========");
        UPI_Payments upi = new UPI_Payments();
        upi.processPayment(amount);
        upi.generateReceipt(upi.getTransactionId());
    }
}
