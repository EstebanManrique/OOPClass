public class Net 
{
    protected Tupla[] paginasNet;
    private static Net instance=null;
    public Net()
    {
        paginasNet=new Tupla[10];
    }
        Tupla<String,String> net1=new Tupla<>("steam.net","192.167.0.1");
        Tupla<String,String> net2=new Tupla<>("itesm.net","192.167.0.2");
        Tupla<String,String> net3=new Tupla<>("ibero.net","192.167.0.3");
        Tupla<String,String> net4=new Tupla<>("up.net","192.167.0.4");
        Tupla<String,String> net5=new Tupla<>("anahuac.net","192.167.0.5");
        Tupla<String,String> net6=new Tupla<>("uvm.net","192.167.0.6");
        Tupla<String,String> net7=new Tupla<>("ipn.net","192.167.0.7");
        Tupla<String,String> net8=new Tupla<>("unam.net","192.167.0.8");
        Tupla<String,String> net9=new Tupla<>("harvard.net","192.167.0.9");
        Tupla<String,String> net10=new Tupla<>("cambridge.net","192.167.0.10");
    protected Tupla[] paginaNet={net1,net2,net3,net4,net5,net6,net7,net8,net9,net10};
    public Tupla[] obtenerData()
    {
        return paginaNet;
    }
    public static Net getInstanceof()
    {
        if(instance==null)
        {
            instance=new Net();
        }
        return instance;
    }
}