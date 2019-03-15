public class InsufficientFundsException extends Exception
{
    protected double cantidadFaltante;
    
    public InsufficientFundsException(double cantidadFaltante)
    {
        this.cantidadFaltante=cantidadFaltante;
    }
    public String toString()
    {
        return new String("te faltan "+cantidadFaltante+" pesos");
    }
}