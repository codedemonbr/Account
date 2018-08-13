import java.util.Scanner;

public class AccountTestDrive
{
    public static void main(String[] args) {

        //First test drive
        /*Scanner input = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.println("The inicial name is " + myAccount.getName());

        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);

        System.out.println();

        System.out.println("The name inside the object myAccount is " + myAccount.getName());
        */
        //Second test drive
        /*Account account1 = new Account("John Blue");
        Account account2 = new Account("Mary Lamb");

        System.out.println("account1 name = " + account1.getName());
        System.out.println("account2 name = " + account2.getName());*/

        Account account1 = new Account("Jhon Green", 500);
        Account account2 = new Account("Peter White", -79);

        System.out.println("Account1 " + account1.getName() + " balance " + account1.getBalance());
        System.out.println("Account1 " + account2.getName() + " balance " + account2.getBalance());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount for account1:");
        double depositAmount = input.nextDouble();

        System.out.println("adding US$"+ depositAmount);
        account1.Deposit(depositAmount);

        System.out.println("Amount account1 " +account1.getBalance());
        System.out.println("Amount account2 " +account2.getBalance());

        System.out.println("Enter the amount for account2:");
        depositAmount = input.nextDouble();

        System.out.println("adding US$"+ depositAmount);
        account2.Deposit(depositAmount);

        System.out.println("Amount account1 " +account1.getBalance());
        System.out.println("Amount account2 " +account2.getBalance());

    }
}
