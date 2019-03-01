public class Hamburger implements PriceRelatable
{
    protected int numeroCarnes;

    public Hamburger(int numeroCarnes)
    {
        this.numeroCarnes=numeroCarnes;
    }

    public int getPrice()
    {
        if(numeroCarnes==2)
        {
            return 57;
        }
        return 67;
    }
}