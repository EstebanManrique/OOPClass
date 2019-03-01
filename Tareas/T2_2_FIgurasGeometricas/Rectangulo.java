public class Rectangulo implements Figura 
{
    protected double ladoLargo;
    protected double ladoCorto;

    public Rectangulo(double ladoLargo, double ladoCorto)
    {
        this.ladoLargo=ladoLargo;
        this.ladoCorto=ladoCorto;
    }
    public double getLadoLargo()
    {
        return ladoLargo;
    }
    public void setLadoLargo(double ladoLargo)
    {
        this.ladoLargo=ladoLargo;
    }
    public double getLadoCorto()
    {
        return ladoCorto;
    }
    public void setLadoCorto(double ladoCorto)
    {
        this.ladoCorto=ladoCorto;
    }
    public double getPerimetro()
    {
        return ((ladoCorto*2)+(ladoLargo*2));
    }
    public double getArea()
    {
        return (ladoCorto*ladoLargo);
    }
}