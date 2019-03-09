package Actividades.A5_2_Varios.Velas;
public class VelaAromatica extends Vela
{
    public VelaAromatica(String color, int altura)
    {
        super(color,altura);
        this.precio=calcularPrecio();
    }
    public double calcularPrecio()
    {
        precio=(altura/10.d)*80;
        return precio;
    }
    public void imprimirPrecio()
    {
        System.out.println("El precio de la vela de color "+this.getColor()+" y con altura de "+this.getAltura()+"cm cuesta: "+calcularPrecio());
    }
}