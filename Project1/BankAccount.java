package Project1;

import java.util.Scanner;
/*
 * Appas Bank
 * Bank Account Parameters:
 * public Name -> String ✓
 * private Balance -> double ✓ 
 * private Date of Birth -> String ✓
 * private SSN -> int (Maybe String) ✓
 * private Account Number -> int ✓
 * 
 * Bank Account Methods:
 * Constructor 
 * Getters and Setters
 * Deposit
 * Withdraw
 * Transfer (HomeWork)
 * Balance
 * Menu
 * Compound Interest
 * Simple Interest (HomeWork)
 * Authentication Basic
 * Authentication Advanced (HomeWork?)
 * 
 * Bank Account Constructor
 * Name, Balance, SSN, Account Number, Date of Birth
 * Name, SSN
 */

import javax.security.auth.login.AccountExpiredException;

public class BankAccount {

    private static BankAccount myAccount;
    private static BankAccount yourAccount;
    // Bank Account Parameters
    public String name;
    private double balance;
    private String dob;
    private int ssn;
    private int accountNumber;
    public double interestRate = 0.01;
    public int period = 4; // quarterly
    public double overDraft;
    // private boolean isSavings;
    // public String savingsAccount;



    // Bank Account Constructor
    public BankAccount(String name, int ssn, double balance, int accountNumber, String dob) {
        this.name = name;
        this.ssn = ssn;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.dob = dob;

    

    }
    

    
    
    


    // Bank Account Constructor
    public BankAccount(String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    // Bank Account Methods

    // Note you do need to create a getter for public variables however it is best
    // practice to create a getter for all variables

    /*
     * Getters and Setters
     */

    public String getName() {
        return this.name;
    }

    public double getbalance() {
        return this.balance;
    }

    public String getdob() {
        return this.dob;
    }

    public int getssn() {
        return this.ssn;
    }

    public int getaccountNumber() {
        return this.accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*
     * Should only be used by during the creation of the account never after instead
     * see deposit and withdraw
     */
    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void setdob(String dob) {
        this.dob = dob;
    }

    public void setssn(int ssn) {
        this.ssn = ssn;
    }

    public void setaccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
       this.balance -= amount;


       }

    public void overdraft(BankAccount bank, double amount ) {
       if (this.balance - amount <= 0) {
        System.out.println("Warning: This withdrawl will put you in the negatives");
        System.out.println("Do you want to proceed?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        Scanner scanner =  new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            double newBal = this.balance - amount - 35;
            System.out.println("Withdrawl of $" + newBal + " successful. Overdraft fee of $35 charged");
        } else if (choice == 2) {
            System.out.println("Withdrawl cancelled");

        
        } 
        
       } else {
        this.balance -= amount;
        
        System.out.println("Withdrawl of $" + amount + " successful");

       }
        // withdrawal is within balance limit
        
    }



    
    //*
    // Scanner input = new Scanner(System.in);
    //     int choice = input.nextInt();
    // if (this.balance - amount <= 0) {
    //     System.out.println("This will put you in the negatives. Proceed? If you proceed, a fee will be charged");
    //     System.out.println("1. Yes");
    //     System.out.println("2. No");
        
    // }else if (choice == 1) {
    //     this.balance -= 35;
    //     System.out.println("A $35 dollar fee will be attached to your account for the overdraft of your account");
    

    // } else if (choice == 2) {
    //     System.out.println("Withdrawl cancelled");

    // } else {
    //     this.balance -= amount;
    //     System.out.println("Withdrawl Successful");

    // }*/

        // int choice = menu()
        // else if (choice == 1) { 

    

    //    double totalAmount = amount;
    //     if (this.balance < amount) {
    //         if (this.balance < 0) {
// // if (amount <= 0) {
//     System.out.println("A fee will be charged");  
//     this.balance -= 35;
//    }else if (amount < this.balace)
//     this.balance -= amount;
    //             if ((this.balane - ) >= amount) {
    //                 System.out.rintln("$35 overdraft fee charged.");
    //                 this.balanc -= 35.0;
                
    //             }  else 
    //                 System.out.println("Withdrawl failed. Overdraft limit exceeded.");
    //                 return;
                
    //             } 
    //         } else {
    //                 System.out.println("Withdrawl Failed. Insufficent balance");
    //                 return;
    //                 }
    //             }



    //         this.balance -= totalAmount;
    //         System.out.println("$" + totalAmount + "successfully withdrawn. Current balance is" + this.balance);

        

            
    
    


        

      
        // this.balance -= amount;
        // if (this.balance < 0) {
        //     this.balance -= 35;
        // System.out.println("A $35 dollar fee will be attached to your account for the overdraft of your account");


    public static void transfer(BankAccount bankAccount1, BankAccount bankAccount2, double amount) {
        if (bankAccount1.getbalance() >= amount) {
            bankAccount1.withdraw(amount);
            bankAccount2.deposit(amount);
            System.out.println("$" + amount + " has been transferred from " + bankAccount1 + " to " + bankAccount2);
        } else {
            System.out.println("Transfer failed. Insufficient funds in " + bankAccount1); }


        }


       
 
    
    
    
    
    

    
    
        


    // Create a mthod that will subtract a mothly fee from the balance
    // this method will take a double as a parameter
    // this method will subtract the fee from the balance
    // Netflix subscription is $12.99
    public void monthlyFee(double fee) {
        withdraw(fee);
    }

    // Create a method that will print a menu to the user
    // This is called a helper method / function
    public static int menu() {
        int choice;
        Scanner input = new java.util.Scanner(System.in);
        System.out.println("Welcome to Appas Bank");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Transfer"); // HomeWork
        System.out.println("4. Balance");
        System.out.println("5. Compound Interest");
        System.out.println("6. Simple Interest"); // HomeWork
        System.out.println("0. Exit");
        System.out.println("Please enter your choice: ");
        choice = input.nextInt();
        return choice;
    }

    public void printBalance() {
        System.out.println("Your balance is: $" + this.balance);
    }

    // Create a method that will interact with the user based on their choice from
    // the menu method
    // This method will take a Bank Account as a parameter
    public static void interact(BankAccount account) {
        // get the choice from the menu method
        int choice = menu();
        Scanner input = new java.util.Scanner(System.in);



        
        // create a scanner object
        
        // use that choice and run the method associated with that choice

        if (choice == 1) {
            System.out.println("Please enter the amount you would like to deposit: ");
            double amount = input.nextDouble();
            account.deposit(amount);
            account.printBalance();
        } else if (choice == 2) {
            System.out.println("How much would you like to withdraw?");
            double amount = input.nextDouble();
            if (amount >= account.getbalance()) {
                account.overdraft(account, amount);
            } else {
                account.withdraw(amount);
                account.printBalance();
            }

            
            
        
    
            
                
            

            // account.printBalance();
        
        } else if (choice ==3) {
            System.out.println("How much would you like to transfer?");
            double amount = input.nextDouble();
            System.out.println("From Which account?");
            String fromAccount = input.next();
            System.out.println("To which account?");
            String toAccount = input.next();
             
            transfer(account, AccountExpiredException,  amount);

            account.printBalance();
        
        }  else if (choice == 4) {
            account.printBalance();
        }
        // } else if (choice == 5) {
        //      System.out.println("How many years? (Whole numbers only)");
        //     int years = input.nextInt();;
        //     account.calculateCompoundInterest(principal, years, account.interestRate);
        //     account.printBalance(); 
        // } else if (choice == 6) {
        //      System.out.println("How many years? (Whole numbers only)");
        //      int years = input.nextInt();
        //      account.simpleInterest(account.getbalance(), years, account.interestRate);
        //      account.printBalance();
        // place holder for choice 6
        else if (choice == 0) {
            System.out.println("Thank you for banking with Appas Bank");
        } else { // this would catch any invalid choices like
            System.out.println("Invalid choice"); 



        }
        }
    

    // Create a method that will calculate the interest on the balance using
    // compound interest
    // P(1 + R/n)^(nt) - P
    // A = P(1 + R/n)^(nt)
    // P = Principal
    // R = Rate
    // n = number of times interest is compounded per year (annum)
    // t = number of years
    // This method will take a double as an argument
    // This method will return a double

    // P can be this.balance or getBalance() if you would like to use a getter

    


    public static void  calculateCompoundInterest(double principal, int time, double rate, int annum) {
        double amount = principal * Math.pow(1 + (rate / annum), annum * time);
        double roundedAmount = Math.round(amount * 100.0) / 100.0;
        double compinterest = amount - principal; // A-P
        compinterest = Math.round(compinterest * 100.0) / 100;

        System.out.println("Current Rate is: " + rate + "%");
        System.out.println("Current Period is: " + annum + " times per year");
        System.out.println("Selected Time is: " + time + " years");
        System.out.println("Compound Interest after " + time + " years is: $" + compinterest);
        System.out.println("Total Amount after " + time + " years is: $" + roundedAmount);
    }


    public void simpleInterest(double principal, int time, double rate) {
        double amount = (principal * rate * time) / 100;
        double roundedAmount = Math.round(amount * 100.0) / 100.0;
        double simpleinterest = amount - principal; // A-P

        System.out.println("Current Rate is: " + rate + "%");
        System.out.println("Selected Time is: " + time + " years");
        System.out.println("Simple Interest after " + time + " years is: $" + simpleinterest);
        System.out.println("Total Amount after " + time + " years is: $" + roundedAmount);





    } 
}


