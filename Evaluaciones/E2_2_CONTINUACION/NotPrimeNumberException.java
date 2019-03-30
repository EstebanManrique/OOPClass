public class NotPrimeNumberException extends Exception
{
    protected int numero1=0;
    protected int numero2=0;
    public NotPrimeNumberException (int numero1, int numero2)
    {
        this.numero1=numero1;
        this.numero2=numero2;
    }
    public NotPrimeNumberException (int numero1)
    {
        this.numero1=numero1;
    }
    public String toString()
    {
        return new String( "No se cumplen con las condiciones del tipo de primo indicado.");
    }
}