package Actividades.A5_2_Varios.Libros;
public abstract class Libro
{
    protected String autor;
    protected String titulo;
    protected int anoPublicacion;
    protected int edicion;
    //protected int precio;

    public Libro(String autor, String titulo, int anoPublicacion, int edicion, int precio)
    {
        this.autor=autor;
        this.titulo=titulo;
        this.anoPublicacion=anoPublicacion;
        this.edicion=edicion;
    }
    public String getAutor()
    {
        return autor;
    }
    public void setAutor(String autor)
    {
        this.autor=autor;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    public int getAnoPub()
    {
        return anoPublicacion;
    }
    public void setAnoPub(int anoPublicacion)
    {
        this.anoPublicacion=anoPublicacion;
    }
    public int getEdicion()
    {
        return edicion;
    }
    public void setEdicion(int edicion)
    {
        this.edicion=edicion;
    }
}