public class Triangulo implements Figura
{
    protected double lado1; //En caso de que sea un triangulo escaleno 
    protected double lado2; //En caso de que sea un triangulo escaleno
    protected double base;
    protected double altura;

    public Triangulo(double lado1, double lado2, double base, double altura)
    {
        this.lado1=lado1;
        this.lado2=lado2;
        this.base=base;
        this.altura=altura;
    }
    public double getLado1()
    {
        return lado1;
    }
    public void setLado1(double lado1)
    {
        this.lado1=lado1;
    }
    public double getLado2()
    {
        return lado2;
    }
    public void setLado2(double lado2)
    {
        this.lado2=lado2;
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
        return (lado1+lado2+base);
    }
    public double getArea()
    {
        return((base*altura)/2);
    }
}