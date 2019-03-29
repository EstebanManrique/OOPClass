public class IPAcessDenied extends Exception
{
    protected String ipDenegada;
    public IPAcessDenied(String ipDenegada)
    {
        this.ipDenegada=ipDenegada;
    }
    public String toString()
    {
        return new String("La conexion de la ip "+ipDenegada+" no fue aceptada; por favor intente de nuevo o verifique la seguridad");
    }
}