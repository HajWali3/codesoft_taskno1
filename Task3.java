import java.util.Scanner;

class BankAccount {
    public double accountBalance = 0;
}

class ATMMachine extends BankAccount {
    public void deposit(double amount) {
        this.accountBalance += amount;
        System.out.println("Rs " +
                amount + " Amount deposited into your account. Your current balance is: " + this.accountBalance);

    }

    public void withdraw(double amount) {
        if (accountBalance >= amount) {
            this.accountBalance -= amount;
            System.out.println("Rs " +
                    amount + " Amount withdrawn from your account. Your current balance is: " + this.accountBalance);
        } else
            System.out.println("Your current account balance is insuffucient for this withdrawal");
    }

    public void checkBalance() {
        System.out.println("Your current account balance is: Rs " + this.accountBalance);
    }
}

public class Task3 {
    public static void main(String[] args) {
        ATMMachine customer1 = new ATMMachine();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Welcome to ATM service select your desired option in order to perform action\n1.Deposit \n2.Withdraw \n3.Check Balance \nChoose the values between 1-3");
            boolean validInput = false;
            int choose = 0;

            while (!validInput) {
                if (sc.hasNextInt()) {
                    choose = sc.nextInt();
                    if (choose >= 1 && choose <= 3) {
                        validInput = true;
                    } else {
                        System.out.println("Enter number between 1 and 3");
                    }
                } else {
                    sc.next();
                    System.out.println("Enter a valid number");
                }
            }

            switch (choose) {
                case 1: {
                    System.out.println("Enter the amount you want to deposit: ");
                    boolean validDesposit = false;
                    double amount = 0;
                    while (!validDesposit) {
                        if(sc.hasNextDouble() || sc.hasNextInt()){
                            amount = sc.nextInt();
                            if(amount >= 500){
                                validDesposit = true;
                            } else{
                                System.out.println("Minimum RS 500 amount is allowed for deposit. Your entered amount is less than 500.");
                            }
                            
                        }else {
                            sc.next();
                            System.out.println("Enter valid deposit ammount");
                        }
                    }
                    
                    customer1.deposit(amount);
                }
                    break;
                case 2: {
                    System.out.println("Enter the amount you want to withdraw: ");
                    // double amount = sc.nextInt();
                    boolean validWithdraw = false;
                    double amount = 0;
                    while (!validWithdraw) {
                        if(sc.hasNextDouble() || sc.hasNextInt()){
                            amount = sc.nextInt();
                            if(amount >= 500){
                                validWithdraw = true;
                            } else{
                                System.out.println("Minimum RS 500 amount is allowed for withdrawal. Your entered amount is less than 500.");
                            }
                            
                        }else {
                            sc.next();
                            System.out.println("Enter valid deposit amount");
                        }
                        
                    }
                    
                    customer1.withdraw(amount);
                }
                    break;
                case 3: {
                    customer1.checkBalance();
                }
                    break;

                default:
                    System.out.println("Invalid input!");
                    break;
            }
            int incr = 0;
            while (true) {
                System.out.println("\n1. Exit \n2. Return Back to Main Menu");
                int slect = sc.nextInt();
                if (slect == 1) {
                    incr++;
                    System.out.println("Please take your card.");
                    break;
                }

                else if (slect == 2) {
                    break;
                } else
                    System.out.println("\nEnter a valid input either 1 or 2");
            }
            if (incr != 0)
                break;
        }
        sc.close();
    }
}
