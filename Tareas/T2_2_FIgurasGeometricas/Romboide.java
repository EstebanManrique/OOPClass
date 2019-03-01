public class Romboide implements Figura
{
    protected double ladosA;
    protected double base;
    protected double altura;

    public Romboide(double ladosA, double base, double altura)
    {
        this.ladosA=ladosA;
        this.base=base;
        this.altura=altura;
    }
    public double getLadosA()
    {
        return ladosA;
    }
    public void setLadosA(double ladosA)
    {
        this.ladosA=ladosA;
    }
    public double getBase()
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base=base;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura=altura;
    }
    public double getPerimetro()
    {
        return((2*ladosA)+(2*base));
    }
    public double getArea()
    {
        return(base*altura);
    }
}