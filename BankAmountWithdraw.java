package com.bridgelabz.objectOriented;
import java.util.Scanner;
 class Bank {
     Scanner scanner = new Scanner(System.in);
     private static int balance = 10000; //  generating balance
     //Display balance
     public void viewBalance() {
         System.out.println(balance);
     }
     //credit amount
     public void addBalance() {
         System.out.println("Please enter the amount to add: ");
         int amount = scanner.nextInt();
         balance = balance + amount;
         System.out.println("The updated account balance is: " + balance);
     }
     //withdraw money
     public void withdrawBalance() {
         System.out.println("Enter the amount to be withdraw: ");
         int amount = scanner.nextInt();
         if (amount <= 0) {
             System.out.println("Enter valid amount for withdraw: ");
         } else if (amount <= balance) {
             System.out.println("Withdraw is under process \nWithdraw process is successfully..");
             balance = balance - amount;
             System.out.println("Updated balance is = " + balance);
         } else {
             System.out.println("Insufficient balance...");
         }
     }
     public static class BankAmountWithdraw {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.println("1. To view current balance \n2. To add balance \n3. To withdraw balance");
             Bank bank = new Bank();
             int choice = scanner.nextInt();
             //choosing options to perform related operations
             switch (choice) {
                 case 1:
                     System.out.println("The balance is: ");
                     bank.viewBalance();
                     break;
                 case 2:
                     bank.addBalance();
                     break;
                 case 3:
                     bank.withdrawBalance();
                     break;
             }
         }
     }
 }
