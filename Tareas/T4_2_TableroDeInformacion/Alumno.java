import java.sql.Date;
public class Alumno
{
    protected String nombre;
    protected String matricula;
    protected Escuela escuelaAlQuePertenece;

    public Alumno(String nombre, String matricula, Escuela escuelaAlQuePertenece)
    {
        this.nombre=nombre;
        this.matricula=matricula;
        this.escuelaAlQuePertenece=escuelaAlQuePertenece;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public void setMatricula(String matricula)
    {
        this.matricula=matricula;
    }
    public Escuela getEscuela()
    {
        return escuelaAlQuePertenece;
    }
    public void setEscuela(Escuela escuelaAlQuePertenece)
    {
        this.escuelaAlQuePertenece=escuelaAlQuePertenece;
    }
    public void getMessage(Pizarron pizarron,Mensaje mensaje)
    {
        System.out.println(this.getNombre()+"("+this.getMatricula()+")"+" has recibido el siguiente mensaje:");
        System.out.println(mensaje.getDate()+"    "+mensaje.getTexto());
        System.out.println();
    }
    public void imrprimirHistorialCompleto(Pizarron pizarron)
    {
        pizarron.impresionHistorial(new Date(0,0,1),new Date(8099,11,31));
        System.out.println();
    }
    public void search(Date fechaInicial, Date fechaFinal)
    {

    }
}