public class Trapecio implements Figura
{
    protected double lados;
    protected double baseMayor;
    protected double baseMenor;
    protected double altura;

    public Trapecio(double lados, double baseMayor, double baseMenor, double altura)
    {
        this.lados=lados;
        this.baseMayor=baseMayor;
        this.baseMenor=baseMenor;
        this.altura=altura;
    }
    public double getLados()
    {
        return lados;
    }
    public void setLados(double lados)
    {
        this.lados=lados;
    }
    public double getBaseMayor()
    {
        return baseMayor;
    }
    public void setBaseMayor(double baseMayor)
    {
        this.baseMayor=baseMayor;
    }
    public double getBaseMenor()
    {
        return baseMenor;
    }
    public void setBaseMenor(double baseMenor)
    {
        this.baseMenor=baseMenor;
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
        return ((lados*2)+baseMayor+baseMenor);
    }
    public double getArea()
    {
        return ((altura*(baseMayor+baseMenor)/2));
    }
}