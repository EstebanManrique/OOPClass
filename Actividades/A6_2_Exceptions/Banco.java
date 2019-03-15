public class Banco
{
    protected double balance;

    private Banco()
    {

    }
    public Banco(double initialBalance)
    {
        balance=initialBalance;
    }
    public double retirar(double amount) throws InsufficientFundsException
    {
        if(amount>balance)
        {
            throw new InsufficientFundsException(amount-balance);
        }
        return (balance-amount);
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
}