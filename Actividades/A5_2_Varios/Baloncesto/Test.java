package Actividades.A5_2_Varios.Baloncesto;
public class Test
{
    public static void main(String[] args) 
    {
        Jugador jugador1=new Jugador("Ray","Allen",80,345);    
        Jugador jugador2=new Jugador("Ray","Allen",80,345);
        Jugador jugador3=new Jugador("Ray","Allen",80,345);
        Jugador jugador4=new Jugador("Ray","Allen",80,345);

        Capitan capitan1=new Capitan("Kobe","Bryant",32,6789);  
        Capitan capitan2=new Capitan("Kobe","Bryant",32,6789); 

        jugador1.seguirOrdenes();
        capitan1.darOrdenes(jugador1);

    }
}