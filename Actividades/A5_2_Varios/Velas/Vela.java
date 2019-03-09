package Actividades.A5_2_Varios.Velas;
public class Vela
{
    protected String color;
    protected int altura;
    protected double precio;

    public Vela(String color, int altura)
    {
        this.color=color;
        this.altura=altura;
        this.precio=calcularPrecio();
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public int getAltura()
    {
        return altura;
    }
    public void setAltura(int altura)
    {
        this.altura=altura;
    }
    public double calcularPrecio()
    {
        precio=(altura/8.d)*50;
        return precio;
    }
    public void imprimirPrecio()
    {
        System.out.println("El precio de la vela de color "+this.getColor()+" y con altura de "+this.getAltura()+"cm cuesta: "+calcularPrecio());
    }
}