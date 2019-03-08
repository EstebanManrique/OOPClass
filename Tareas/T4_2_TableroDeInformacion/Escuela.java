import java.sql.Date;
public class Escuela
{
    protected String nombre;
    protected String nivelEducativo;
    
    public Escuela(String nombre, String nivelEducativo)
    {
        this.nombre=nombre;
        this.nivelEducativo=nivelEducativo;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getNivelEducativo()
    {
        return nivelEducativo;
    }
    public void setNivelEducativo(String nivelEducativo)
    {
        this.nivelEducativo=nivelEducativo;
    }
    public Mensaje post(Mensaje mensaje)
    {
        return mensaje;
    }
    public void imrprimirHistorialCompleto(Pizarron pizarron)
    {
        pizarron.impresionHistorial(new Date(0,0,1),new Date(8099,11,31));
        System.out.println();
    }
    public void buscarEImprimir(Date fechaInicial, Date fechaFinal)
    {
       
    }
}