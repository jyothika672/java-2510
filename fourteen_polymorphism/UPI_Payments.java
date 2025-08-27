package fourteen_polymorphism;

import java.util.Scanner;

public class UPI_Payments extends AbstractPayment{
    private String upiId;
    public String getUpiId() {
        return upiId;
    }
    public void setUpiId(String upiId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI ID: ");
        upiId += sc.nextInt();
        upiId += sc.nextLine(); //buffer
        this.upiId = upiId;
    }
    private String upiPaymentType;
    public String getUpiPaymentType() {
        return upiPaymentType;
    }
    public void setUpiPaymentType(String upiPaymentType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Number: ");
        upiPaymentType += sc.nextInt();
        upiPaymentType += sc.nextLine();//buffer
        this.upiPaymentType = upiPaymentType;
    }
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing via UPI Payments Of "+amount);
    }
    
}
