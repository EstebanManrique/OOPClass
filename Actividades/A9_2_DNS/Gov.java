public class Gov
{
    protected Tupla[] paginasGov;
    private static Gov instance=null;
    public Gov()
    {
        paginasGov=new Tupla[10];
    }
        Tupla<String,String> gov1=new Tupla<>("peje.gov","192.157.0.1");
        Tupla<String,String> gov2=new Tupla<>("anaya.gov","192.157.0.2");
        Tupla<String,String> gov3=new Tupla<>("ariel.gov","192.157.0.3");
        Tupla<String,String> gov4=new Tupla<>("meade.gov","192.157.0.4");
        Tupla<String,String> gov5=new Tupla<>("bronco.gov","192.157.0.5");
        Tupla<String,String> gov6=new Tupla<>("norona.gov","192.157.0.6");
        Tupla<String,String> gov7=new Tupla<>("margaraita.gov","192.157.0.7");
        Tupla<String,String> gov8=new Tupla<>("barbosa.gov","192.157.0.8");
        Tupla<String,String> gov9=new Tupla<>("gerry.gov","192.157.0.9");
        Tupla<String,String> gov10=new Tupla<>("calderon.gov","192.157.0.10");
    protected Tupla[] paginaGov={gov1,gov2,gov3,gov4,gov5,gov6,gov7,gov8,gov9,gov10};
    public Tupla[] obtenerData()
    {
        return paginaGov;
    }
    public static Gov getInstanceof()
    {
        if(instance==null)
        {
            instance=new Gov();
        }
        return instance;
    }
}