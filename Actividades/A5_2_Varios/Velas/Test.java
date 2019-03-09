package Actividades.A5_2_Varios.Velas;
public class Test
{
    public static void main(String[] args) 
    {
        Vela velaNormal=new Vela("Verde",34);
        velaNormal.imprimirPrecio();

        VelaAromatica velaAromaRico= new VelaAromatica("Azul",42);
        velaAromaRico.imprimirPrecio();
    }
}