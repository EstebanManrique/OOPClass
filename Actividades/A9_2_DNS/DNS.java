public class DNS implements Predefinido<DNS>
{
    protected String entradaUsuario;
    Tupla[]paginasCom=new Tupla[10];
    Tupla[]paginasNet=new Tupla[10];
    Tupla[]paginasMX=new Tupla[10];
    Tupla[]paginasGob=new Tupla[10];
    boolean encontrado;

    public DNS(Com com, Net net, Mx mx, Gov gov)
    {
       encontrado=true;
       paginasCom=com.obtenerData();
       paginasNet=net.obtenerData();
       paginasMX=mx.obtenerData();
       paginasGob=gov.obtenerData();
    }
    public String getEnradaUsuario(String entradaUsuario)
    {
        return entradaUsuario;
    }
    public String busquedaLinkEnDns(String entradaUsuario) throws IPNotFoundException
    {
        int longitud=entradaUsuario.length();
        if(entradaUsuario.charAt(longitud-1)=='m')
        {
            for(int i=0;i<10;i++)
            {
                if((entradaUsuario.equals((String)paginasCom[i].getDominio())))
                {
                    return (String)paginasCom[i].getIp();
                }
            }
        }
        else if(entradaUsuario.charAt(longitud-1)=='x')
        {
            for(int i=0;i<10;i++)
            {
                if(entradaUsuario.equals((String)paginasMX[i].getDominio()))
                {
                    return (String)paginasMX[i].getIp();
                }
            }

        }
        else if(entradaUsuario.charAt(longitud-1)=='t')
        {
            for(int i=0;i<10;i++)
            {
                if(entradaUsuario.equals((String)paginasNet[i].getDominio()))
                {
                    return (String)paginasNet[i].getIp();
                }
            }
        }
        else if(entradaUsuario.charAt(longitud-1)=='v')
        {
            for(int i=0;i<10;i++)
            {
                if(entradaUsuario.equals((String)paginasGob[i].getDominio()))
                {
                    return (String)paginasGob[i].getIp();
                }
            }
        }
        encontrado=false;
        if(encontrado==false)
        {
            throw new IPNotFoundException(entradaUsuario);
        }

        return entradaUsuario;
    }
        public void Exceptioon() throws IPNotFoundException
    {
        
    }

}