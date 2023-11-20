package Practic;

public class Bank {
    public static void main(String[] args) {





        BankCustomer customer1 = new BankCustomer("Artur");
        BankCustomer customer2 = new BankCustomer("Petya");

        customer1.addAccount();
        customer2.addAccount();

        BankTransaction transaction = new BankTransaction(1500,"deposit");
        BankTransaction transaction1 = new BankTransaction(1000,"withdraw");

        customer1.getTransaction(1,transaction);
        customer2.getTransaction(1,transaction);


        customer1.getBalance(1);
        customer1.getTransaction(1,transaction1);
        customer2.getAccountHistory(1);
        System.out.println(customer1.getBalance(1));



    }
}
