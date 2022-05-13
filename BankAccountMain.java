import java.util.Scanner;
import java.util.ArrayList;

public class BankAccountMain {
    static ArrayList<BankAccount> bankAccount = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        bankAccount.add(new BankAccount("Sanika", 10001, 4000));
        bankAccount.add(new BankAccount("Jaydeep",10002, 5000));
        bankAccount.add(new BankAccount("Anish", 10003, 1000));
        bankAccount.add(new BankAccount("Aarav", 10004, 500));

        System.out.println("Hello world! Welcome to the bank of India");

        while (true) {
        System.out.println("Are you an existing customer? Yes or No (Enter -1 to exit)");
        String response = scanner.nextLine();

        if (response.equals("-1")) {
            System.out.println("Good bye!");
            break;
        }

        else if 
        (response.equalsIgnoreCase("yes")){
        System.out.println("That's great! What is your account number?");
        int accountNum = Integer.valueOf(scanner.nextLine());

        boolean isAccountHolder = false;
                int index = -1;
                for (int i = 0; i < bankAccount.size(); i++) {
                    //BankAccount accounts = bankAccount.get(i);
                    if (bankAccount.get(i).getAccountNumber() == accountNum) {
                        isAccountHolder = true;
                        index = i;
                    }
                }
                if (isAccountHolder) {
                    mainMenu(bankAccount.get(index));
                }
                else {
                    System.out.println("Sorry, we couldn't find your account number, try again");
                }
            }
        else if   
        (response.equalsIgnoreCase("no")) {
            BankAccount newAccount = new BankAccount(); 

            System.out.println("Let's make a new account");
            System.out.println("What is the name for the account?");
            String responsename = scanner.nextLine();
            newAccount.setAccountHolderName(responsename); 
            System.out.println("What is the beginning balance for the account?");
            double responseAmount = Double.valueOf(scanner.nextLine());
            newAccount.setAccountBalance(responseAmount);
            bankAccount.add(newAccount);
            mainMenu(bankAccount.get(bankAccount.size() - 1));
        }
        } 
    }
    
public static void mainMenu(BankAccount accounts) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello!" + accounts.getAccountHolderName());
        System.out.println("Welcome to the main menu, what would you like to do today?");
        System.out.println();
    
        while (true) {
            System.out.println("-- Main Menu --");
            System.out.println("1: Check balance");
            System.out.println("2: Make withdrawal");
            System.out.println("3: Make deposit");
            System.out.println("4: Make transfer");
            System.out.println("0: Exit");
            System.out.print("> ");
            int response = Integer.valueOf(scanner.nextLine());
            System.out.println();

            if (response == 0){
                System.out.println("Good bye");
                break;
            
            }
            //Get Account Balance
            else if (response == 1) {
                System.out.println(accounts.getAccountBalance());
            
            //Withdrawal
            } else if (response == 2) {
                System.out.println("Please enter the amount you want to withdraw: ");
                double withdrawalAmount = Double.valueOf(scanner.nextLine());
                accounts.withdrawal(withdrawalAmount);
                System.out.println("The amount: " + withdrawalAmount + " has been taken out.");
                System.out.println("New Balance is: " + accounts.getAccountBalance());
            
            //Deposit
            } else if (response == 3) {
                System.out.println("Please enter the amount you want to deposit: ");
                double depositAmount = Double.valueOf(scanner.nextLine());
                accounts.deposit(depositAmount);
                System.out.println("The amount: " + depositAmount + " has been added to your account.");
                System.out.println("New Balance is: " + accounts.getAccountBalance());
            
            //Transfer to another account
            } 
            else if (response == 4) {
                System.out.println("Please enter the account number to transfer to: ");
                int accountToTransferTo = Integer.valueOf(scanner.nextLine());
                boolean isAccountHolder = false;
                
                int index = -1;
                for (int i = 0; i < bankAccount.size(); i++) {
                    //BankAccount accounts = bankAccount.get(i);
                    if (bankAccount.get(i).getAccountNumber() == accountToTransferTo) {
                        isAccountHolder = true;
                        index = i;
                    }
                }
                if (isAccountHolder && index > -1) {
                    System.out.println("Account is found, How much would you like to transfer: ");
                    double transferAmount = Double.valueOf(scanner.nextLine());
                    accounts.transfer(bankAccount.get(index), transferAmount);
                    System.out.println(accounts.getAccountHolderName() + " moved " + transferAmount + " to " + accountToTransferTo + " and now has " + accounts.getAccountBalance());
                }
                else {
                    System.out.println("Sorry, we couldn't find your account number, try again");
                }
            }
            
     
        }
        scanner.close();   
    }
}    
