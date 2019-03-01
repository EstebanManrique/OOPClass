public class Cuadrado implements Figura
{
    protected double lado;

    public Cuadrado(double lado)
    {
        this.lado=lado;
    }
    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado=lado;
    }
    public double getPerimetro()
    {
        return (lado*4);
    }
    public double getArea()
    {
        return (Math.pow(lado,2));
    }
}