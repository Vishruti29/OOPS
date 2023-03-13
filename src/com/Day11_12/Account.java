package com.Day11_12;

public class Account{
        private double balance;  //balance in the account
        //Constructor for account objects
        Account(double initialBalance){
            //Initializing balance
            if (initialBalance<0){
                //Initial balance cannot be negative and setting initial balance to 0
                System.out.println("Initial Balance is 0");
                balance = 0;
            }else{
                balance = initialBalance;
                System.out.println("Current balance is "+balance);
            }
        }

        public double getBalance() {
            return balance;
        }

        void deposit(double amount){
            //method to deposit money into bank account
            if (amount < 0){
                System.out.println("Deposit cannot be nagative.");
            } else {
                balance += amount;// add depsoit to balance
                System.out.println("After deposit current balance is "+balance);
            }
        }
        void debit(double amount){
            //method to withdraw money from bank acccount
            if (amount < 0){
                System.out.println("Cannot withdraw negative amount");
            }else if (amount > balance){
                System.out.println("Account does not have sufficient balance");
            }else {
                balance -= amount;// subtract withdrawl amount from balance
                System.out.println("After withdrawal current balance is "+balance);
            }
        }
}
