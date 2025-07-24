package fourth_operators;

public class BankTransactions {
    public static void main(String[] args) {
        String Account_Holder_Name = "Jyothika";
        System.out.println("Account Holder Name:"+Account_Holder_Name);
        int Transactions = 0;
        double Account_Balance = 8900;
        boolean Account_Status = Account_Balance>1000;
        System.out.println("Account Balance:" +Account_Balance);
        System.out.println("Account Status:"+Account_Status);
        double Deposit_Amount = 1000;
        System.out.println("Deposit Amount:" +Deposit_Amount);
        boolean Vaild_deposit = Deposit_Amount>500 && Account_Status;
        System.out.println("Valid Deposit:"+Vaild_deposit);
        Account_Balance += Deposit_Amount;
        Transactions++;
        System.out.println("Account Balance:"+Account_Balance);
        double Withdrawal_Amount = 100;
        System.out.println("Withdrawal Amount:"+Withdrawal_Amount);
        Account_Balance = Account_Balance - Withdrawal_Amount;
        Transactions++;
        System.out.println("Account Balance:"+Account_Balance);
        System.out.println();
        System.out.println("Final Balance in Account:"+Account_Balance);
        System.out.println("Number of Transcations:"+Transactions);

    } 
}
