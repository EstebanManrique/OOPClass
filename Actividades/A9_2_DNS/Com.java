public class Com 
{
    protected Tupla[] paginasCom;
    private static Com instance=null;
    public Com()
    {
        paginasCom=new Tupla[10];
    }
        Tupla<String,String> com1=new Tupla<>("google.com","192.168.0.1");
        Tupla<String,String> com2=new Tupla<>("facebook.com","192.168.0.2");
        Tupla<String,String> com3=new Tupla<>("twitter.com","192.168.0.3");
        Tupla<String,String> com4=new Tupla<>("instagram.com","192.168.0.4");
        Tupla<String,String> com5=new Tupla<>("youtube.com","192.168.0.5");
        Tupla<String,String> com6=new Tupla<>("yahoo.com","192.168.0.6");
        Tupla<String,String> com7=new Tupla<>("bing.com","192.168.0.7");
        Tupla<String,String> com8=new Tupla<>("outlook.com","192.168.0.8");
        Tupla<String,String> com9=new Tupla<>("tumblr.com","192.168.0.9");
        Tupla<String,String> com10=new Tupla<>("amazon.com","192.168.0.10");
    protected Tupla[] paginaCom={com1,com2,com3,com4,com5,com6,com7,com8,com9,com10};
    public Tupla[] obtenerData()
    {
        return paginaCom;
    }
    public static Com getInstanceof()
    {
        if(instance==null)
        {
            instance=new Com();
        }
        return instance;
    }

}