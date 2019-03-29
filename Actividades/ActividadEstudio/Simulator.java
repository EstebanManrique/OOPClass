public class Simulator 
{
    protected String ip;
    protected String webpage;
    protected ReglaDeNavegacion[]arrayReglas;
    protected boolean bandera;

    public Simulator(IPTables tabla)
    {
        //System.out.println(bandera);
        arrayReglas= new ReglaDeNavegacion[10000];
        arrayReglas=tabla.mandarArray();
        this.ip=ip;
        this.webpage=webpage;
    }
    public void simulateNavigation(String ipUsuario, String sitioANavegar, IPTables tabla) throws IPAcessDenied
    {
        int contadorBusqueda=0;
        while(contadorBusqueda<10000)
        {
            if(tabla.running())
            {
                    if(ipUsuario.equals((String)arrayReglas[contadorBusqueda].getSourceIp()))
                    {
                        if(arrayReglas[contadorBusqueda].getAction().equals("ACCEPT"))
                        {
                            System.out.println("ip: "+ipUsuario+" is navigating in the site "+sitioANavegar);
                            break;
                        }
                        else if(arrayReglas[contadorBusqueda].getAction().equals("REJECT"))
                        {
                            System.out.println(".......");
                            break;
                        }
                        else
                        {
                            throw new IPAcessDenied(ipUsuario);
                        }
                        
                    } 
                    contadorBusqueda++;     
            }
        }
    }
    public String getIpUser(String ipEntry)
    {
        ip=ipEntry;
        return ip;
    }
    public String getWebPageUser(String webpageEntry) 
    {
        webpage=webpageEntry;
        return webpage;
    }
}