public class Test
{
    public static void main(String[] args) 
    {
        IPTables tabla=new IPTables();
        Simulator simulator= new Simulator(tabla);
        tabla.start();
        tabla.addRule("A","10.22.0.1","ACCEPT");
        tabla.addRule("A","10.27.0.1","ACCEPT");
        tabla.addRule("A","10.21.0.1","REJECT");
        tabla.addRule("A","10.21.0.4","REJECT");
        tabla.addRule("A","10.51.0.1","DROP");
        try
        {
            simulator.simulateNavigation("10.22.0.1","instagram.com",tabla);
            simulator.simulateNavigation("10.27.0.1","instagram.com",tabla);
        }
        catch(IPAcessDenied e)
        {
            System.out.println(e.toString());
        }
        try
        {
            simulator.simulateNavigation("10.21.0.1","instagram.com",tabla);
            simulator.simulateNavigation("10.21.0.4","instagram.com",tabla);
        }
        catch(IPAcessDenied e)
        {
            System.out.println(e.toString());
        }
        try
        {
            simulator.simulateNavigation("10.51.0.1","instagram.com",tabla);
        }
        catch(IPAcessDenied e)
        {
            System.out.println(e.toString());
        }
        tabla.end();
        try
        {
            simulator.simulateNavigation("10.51.0.1","instagram.com",tabla);
        }
        catch(IPAcessDenied e)
        {
            System.out.println(e.toString());
        }
    }
}