package Slip1;

import java.util.Scanner;

public class Slip15_2 {

	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter Customer Name: ");
	        String name = sc.nextLine();

	        System.out.println("Enter Account Number: ");
	        long accno = sc.nextLong();

	        System.out.println("Enter Saving Balance: ");
	        double balance = sc.nextDouble();

	        System.out.println("Enter Minimum Balance: ");
	        double minbal = sc.nextDouble();

	        System.out.println("Enter Deposit Amount: ");
	        double deposit = sc.nextDouble();

	        System.out.println("Enter Withdrawal Amount: ");
	        double withdraw = sc.nextDouble();

	        // Create AccountDetail object
	        AccountDetail account = new AccountDetail(name, accno, balance, minbal, deposit, withdraw);

	        // Display customer details
	        account.displayCustomerDetails();

}
}
//Account.java
class Account {
 String custname;
 long accno;

 // Default constructor
 public Account() {
     custname = "Unknown";
     accno = 0;
 }

 // Parameterized constructor
 public Account(String custname, long accno) {
     this.custname = custname;
     this.accno = accno;
 }
}

//SavingAccount.java
class SavingAccount extends Account {
 double savingbal;
 double minbal;

 // Default constructor
 public SavingAccount() {
     super();
     savingbal = 0.0;
     minbal = 1000.0;
 }

 // Parameterized constructor
 public SavingAccount(String custname, long accno, double savingbal, double minbal) {
     super(custname, accno);
     this.savingbal = savingbal;
     this.minbal = minbal;
 }
}

//AccountDetail.java
class AccountDetail extends SavingAccount {
 double depositamt;
 double withdrawalamt;

 public AccountDetail(String custname, long accno, double savingbal, double minbal,
                      double depositamt, double withdrawalamt) {
     super(custname, accno, savingbal, minbal);
     this.depositamt = depositamt;
     this.withdrawalamt = withdrawalamt;
 }

 void displayCustomerDetails() {
     System.out.println("--------- Customer Account Details ---------");
     System.out.println("Customer Name   : " + custname);
     System.out.println("Account Number  : " + accno);
     System.out.println("Saving Balance  : " + savingbal);
     System.out.println("Minimum Balance : " + minbal);
     System.out.println("Deposit Amount  : " + depositamt);
     System.out.println("Withdrawal Amt  : " + withdrawalamt);

     // Calculate final balance
     double finalBalance = savingbal + depositamt - withdrawalamt;
     System.out.println("Final Balance   : " + finalBalance);

     if (finalBalance < minbal) {
         System.out.println("⚠ Warning: Balance below minimum required!");
     }
 }
}
