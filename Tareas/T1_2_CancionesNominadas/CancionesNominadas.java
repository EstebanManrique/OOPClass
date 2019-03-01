import java.util.Scanner;
public class CancionesNominadas implements Iterador 
{
    protected String[][] cancionesNominadas;
    protected int contadorCancionesA;
    protected int contadorCancionesB;
    
    public CancionesNominadas()
    {
        cancionesNominadas=new String[10][4];
        contadorCancionesA=0;
        contadorCancionesB=0;
    } 
    public void addCancion(String nombre, String nombreAutor, String pelicula, String estilo )
    {
        if(contadorCancionesA<10)
        {
            cancionesNominadas[contadorCancionesA][contadorCancionesB]=nombre;
            contadorCancionesB++;
            cancionesNominadas[contadorCancionesA][contadorCancionesB]=nombreAutor;
            contadorCancionesB++;
            cancionesNominadas[contadorCancionesA][contadorCancionesB]=pelicula;
            contadorCancionesB++;
            cancionesNominadas[contadorCancionesA][contadorCancionesB]=estilo;
            contadorCancionesB=0;
            contadorCancionesA++;
        }
        else
            System.out.println("Imposible registrar mas canciones");
    }
    public void restablecerPosicionActual()
    {
        contadorCancionesA=0;
        contadorCancionesB=0;
    }   
    public boolean hasNext()
    {
        if(contadorCancionesA<10&&contadorCancionesB<4)
            return true;
        else
            return false;
    }
    public String next()
    {
        return cancionesNominadas[contadorCancionesA][contadorCancionesB];
    }
    public void printDatos()
    {
        System.out.print(next()+" ");
    }
    public void print()
    {
        while(hasNext())
        {
            while(contadorCancionesB<4)
            {
                next();
                printDatos();
                contadorCancionesB++;
            }
            contadorCancionesB=0;
            contadorCancionesA++;
            System.out.println();
            System.out.println();
        }
    }
    public void remove()
    {
        int contador=contadorCancionesA;
    if(contador!=10)
        {
            while(contadorCancionesA<9)
            {
                cancionesNominadas[contadorCancionesA-1][0]=cancionesNominadas[contadorCancionesA+1][0];
                contadorCancionesA++;
           }
            contadorCancionesA=contador;
         while(contadorCancionesA<9)
            {
                cancionesNominadas[contadorCancionesA-1][1]=cancionesNominadas[contadorCancionesA+1][1];
                contadorCancionesA++;
            }
            contadorCancionesA=contador;
         while(contadorCancionesA<9)
        {
            cancionesNominadas[contadorCancionesA-1][2]=cancionesNominadas[contadorCancionesA+1][2];
            contadorCancionesA++;
        }
        contadorCancionesA=contador;
        while(contadorCancionesA<9)
        {
            cancionesNominadas[contadorCancionesA-1][3]=cancionesNominadas[contadorCancionesA+1][3];
            contadorCancionesA++;
        }
        contadorCancionesA=10;
        }
        else
        {
            cancionesNominadas[9][0]=null;
            cancionesNominadas[9][1]=null;
            cancionesNominadas[9][2]=null;
            cancionesNominadas[9][3]=null;
        }
    }
}

