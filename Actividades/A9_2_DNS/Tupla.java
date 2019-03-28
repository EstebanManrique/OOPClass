public class Tupla<D,I>
{
    protected I ipSitio;
    protected D dominioSitio;
    public Tupla (D dominioSitio,I ipSitio)
    {
        this.ipSitio=ipSitio;
        this.dominioSitio=dominioSitio;
    }
    public I getIp()
    {
        return ipSitio;
    }
    public D getDominio()
    {
        return dominioSitio;
    }
    public String toString(I ipSitio, D dominioSitio)
    {
        return new String(ipSitio+":"+dominioSitio);
    }
}