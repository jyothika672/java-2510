package fourteen_polymorphism;

import java.util.Scanner;

public class CreditCardPayment extends AbstractPayment{
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Number: ");
        cardNumber += sc.nextInt();
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
         System.out.println("Processing via Credit Card Payment Of "+amount);
    }

}
