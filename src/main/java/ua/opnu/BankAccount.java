package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0; // комиссия по умолчанию

    // Пополнение счета
    void deposit(double amount) {
        if (amount <= 0) return;
        balance = balance + amount;
    }

    // Получить баланс
    double getBalance() {
        return this.balance;
    }

    // Снять деньги с учетом комиссии
    boolean withdraw(double amount) {
        if (amount <= 0) return false;
        double total = amount + transactionFee;
        if (balance < total) return false; // недостаточно средств
        balance = balance - total;
        return true;
    }

    // Перевод денег на другой счет
    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        double total = amount + transactionFee;
        if (balance < total) return false;
        balance = balance - total;
        receiver.balance = receiver.balance + amount;
        return true;
    }
}
