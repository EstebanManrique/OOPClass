public class Circulo implements Figura 
{
    protected double radio;

    public Circulo (double radio)
    {
        this.radio=radio;
    }
    public double getRadio()
    {
        return radio;
    }
    public void setRadio(double radio)
    {
        this.radio=radio;
    }
    public double getPerimetro()
    {
        return ((radio*2)*pi);
    }
    public double getArea()
    {
        return ((Math.pow(radio, 2)*pi));
    }
}