public class PoligonoRegular implements Figura 
{
    protected int numeroLados;
    protected double lado;
    protected double apotema;
    
    public PoligonoRegular(int numeroLados, double lado, double apotema)
    {
        this.numeroLados=numeroLados;
        this.lado=lado;
        this.apotema=apotema;
    }
    public int getNumeroLados()
    {
        return numeroLados;
    }
    public void setNumeroLados(int numeroLados)
    {
        this.numeroLados=numeroLados;
    }
    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado=lado;
    }
    public double getApotema()
    {
        return apotema;
    }
    public void setApotema(double apotema)
    {
        this.apotema=apotema;
    }
    public double getPerimetro()
    {
        return((numeroLados*lado));
    }
    public double getArea()
    {
        return ((getPerimetro()*apotema)/2);
    }
}