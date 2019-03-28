public class Mx 
{
    protected Tupla[] paginasMx;
    private static Mx instance=null;
    public Mx()
    {
        paginasMx=new Tupla[10];
    }
        Tupla<String,String> mx1=new Tupla<>("segob.mx","192.157.0.1");
        Tupla<String,String> mx2=new Tupla<>("presidencia.mx","192.157.0.2");
        Tupla<String,String> mx3=new Tupla<>("sep.mx","192.157.0.3");
        Tupla<String,String> mx4=new Tupla<>("pgr.mx","192.157.0.4");
        Tupla<String,String> mx5=new Tupla<>("cndh.mx","192.157.0.5");
        Tupla<String,String> mx6=new Tupla<>("defensa.mx","192.157.0.6");
        Tupla<String,String> mx7=new Tupla<>("marina.mx","192.157.0.7");
        Tupla<String,String> mx8=new Tupla<>("canilec.mx","192.157.0.8");
        Tupla<String,String> mx9=new Tupla<>("ssp.mx","192.157.0.9");
        Tupla<String,String> mx10=new Tupla<>("vips.mx","192.157.0.10");
    protected Tupla[] paginaMx={mx1,mx2,mx3,mx4,mx5,mx6,mx7,mx8,mx9,mx10};
    public Tupla[] obtenerData()
    {
        return paginaMx;
    }
    public static Mx getInstanceof()
    {
        if(instance==null)
        {
            instance=new Mx();
        }
        return instance;
    }
}