import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(name, balance);

        int ch;
        do{
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. View Transactions");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = sc.nextDouble();
                    account.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = sc.nextDouble();
                    account.withdraw(withdrawAmt);
                    break;
                case 3:
                    account.viewBalance();
                    break;
                case 4:
                    account.viewTransactions();
                    break;
                case 5:
                    System.out.println("Thank you for banking with us!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }while(ch != 5);
        sc.close();
    }
}
