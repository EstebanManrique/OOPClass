package Actividades.A5_2_Varios.Libros;
public class Test
{
    public static void main(String[] args) 
    {
        LibroFiccion theHungerGames=new LibroFiccion("Suzanne Collins","Hunger Games",2008,2,400);
        theHungerGames.impresionInfo();
        
        LibroNovelaRomatinca romeoAndJuliet=new LibroNovelaRomatinca("Shakespeare","Romeo and Juliet",1975,23,300);
        romeoAndJuliet.impresionInfo();
    }
}