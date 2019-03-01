public class House implements PriceRelatable
{
    protected int numeroCuartos;
    
    public House(int numeroCuartos)
    {
        this.numeroCuartos=numeroCuartos;
    }

    public int getPrice()
    {
        if(numeroCuartos==3)
        {    
            return 100000;
        }
        return 50000;
    }
}