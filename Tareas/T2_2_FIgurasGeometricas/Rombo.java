public class Rombo implements Figura
{
    protected double lado;
    protected double diagonalMayor;
    protected double diagonalMenor;

    public Rombo(double lado, double diagonalMayor, double diagonalMenor)
    {
        this.lado=lado;
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
    }
    public double getLado()
    {
        return lado;
    }
    public void setLado(double lado)
    {
        this.lado=lado;
    }
    public double getDiagonalMayor()
    {
        return diagonalMayor;
    }
    public void setDiagonalMayor(double diagonalMayor)
    {
        this.diagonalMayor=diagonalMayor;
    }
    public double getDiagonalMenor()
    {
        return diagonalMenor;
    }
    public void setDiagonalMenor(double diagonalMenor)
    {
        this.diagonalMenor=diagonalMenor;
    }
    public double getPerimetro()
    {
        return (lado*4);
    }
    public double getArea()
    {
        return ((diagonalMayor*diagonalMenor)/2);
    }
}