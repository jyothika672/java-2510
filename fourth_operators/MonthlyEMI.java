package fourth_operators;

public class MonthlyEMI {
    public static void main(String[] args) {
        double Loan_Amount = 1810887;
        double Annual_Interest_Rate = 9.5;
        int Loan_Months = 4;

        double Monthly_Interest_Rate = Annual_Interest_Rate / 12/100;
        System.out.println("Monthly Interest Rate:"+Monthly_Interest_Rate);
        int number_Of_Months = Loan_Months *12;

        double Emi = ( Loan_Amount * Monthly_Interest_Rate*Math.pow( 1 + Monthly_Interest_Rate,number_Of_Months)) / (Math.pow(1 + Monthly_Interest_Rate,number_Of_Months) - 1);
        System.out.println("Emi:" +Emi);
    }
}
