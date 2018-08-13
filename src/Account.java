public class Account
{
    private String name;
    private double balance;

    //Methods
    public int Deposit(double depositAmount)
    {
        if (depositAmount > 0)
        {
            this.balance += depositAmount;
        }
        else {
            return 1;//you may create a error code
        }
        return 0;
    }
    //Getters and Setters
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Constructors
    public Account(String name, double balance)
    {
        this.name = name;

        if (balance > 0)
        {
            this.balance = balance;
        }
    }

    public Account(String name)
    {
        this.name = name;
    }
    public Account()
    {
        this.name = name;
    }
}
