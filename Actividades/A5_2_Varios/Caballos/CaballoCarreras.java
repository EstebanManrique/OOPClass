package Actividades.A5_2_Varios.Caballos;
import java.sql.Date;
public class CaballoCarreras extends Caballo implements Relinchar 
{
    protected int numeroCarreras;
    protected int numeroCarrerasGanadas;

    public CaballoCarreras(String nombre, String color, String fechaNacimiento, int numeroCarreras, int numeroCarrerasGanadas)
    {
        super(nombre,color,fechaNacimiento);
        this.numeroCarreras=numeroCarreras;
        this.numeroCarrerasGanadas=numeroCarrerasGanadas;
    }
    public int getNumeroCarreras()
    {
        return numeroCarreras;
    }
    public void setNumeroCarreas(int numeroCarreras)
    {
        this.numeroCarreras=numeroCarreras;
    }
    public int getNumeroCarrerasGanadas()
    {
        return numeroCarrerasGanadas;
    }
    public void setNumeroCarreasGanadas(int numeroCarrerasGanadas)
    {
        this.numeroCarrerasGanadas=numeroCarrerasGanadas;
    }
    public void relinchar()
    {
        System.out.println(this.getNombre()+" Relinchando a gran velocidad");
    }
}