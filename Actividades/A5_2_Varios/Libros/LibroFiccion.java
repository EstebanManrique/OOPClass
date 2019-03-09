package Actividades.A5_2_Varios.Libros;
public class LibroFiccion extends Libro
{
    final static int precio=500;
    public LibroFiccion(String autor, String titulo, int anoPublicacion, int edicion, int precio)
    {
        super(autor,titulo,anoPublicacion,edicion,precio);
        precio=precio;
    }
    public int getPrecio()
    {
        return precio;
    }
    public void impresionInfo()
    {
        System.out.println(this.getAutor());
        System.out.println(this.getTitulo());
        System.out.println(this.getAnoPub());
        System.out.println(this.getEdicion());
        System.out.println(this.getPrecio());
        System.out.println();
    }
}