package bankAccountDepositWithdraw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("-------------Welcome to State Bank Of India-----------------");
        System.out.println("Bank Name :"+BankDetails.bankName);
        System.out.print("Bank Code :"+BankDetails.bankCode+"    "+"IFSC Code :"+BankDetails.ifscCode+"    "+"MICR Code :"+BankDetails.micrCode +"\n");
        System.out.println("Enter Customer name and Account Number");

        CustomerDetails customerDetails_1=new CustomerDetails(scanner.next(),scanner.next());
        CustomerDetails customerDetails_2=new CustomerDetails(scanner.next(),scanner.next());
        System.out.println("Display Customer Details : ");
        System.out.println("---------------------------");
        customerDetails_1.displayDetails();
        customerDetails_2.displayDetails();

        Transaction transaction=new Transaction();
        System.out.println("Total balance of customer_1 after deposit = "+transaction.depositeAmount(customerDetails_1,500));
        System.out.println("Total balance of customer_2 after withdraw ="+transaction.withdrawAmount(customerDetails_2,100));

        transaction.transferAmount(customerDetails_1,customerDetails_2,200);
        System.out.println("Withdraw from customer_1 = "+customerDetails_1.displayDetails());
        System.out.println("Deposit to customer_2 = "+customerDetails_2.displayDetails());

    }
}