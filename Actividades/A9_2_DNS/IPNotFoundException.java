public class IPNotFoundException extends Exception
{
    protected String dominioNoEncontrado;
    public IPNotFoundException(String dominioNoEncontrado)
    {
        this.dominioNoEncontrado=dominioNoEncontrado;
    }
    public String toString()
    {
        return new String(dominioNoEncontrado+" no fue encontrado en el DNS");
    }

}