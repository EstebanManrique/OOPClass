public class Test
{
    public static void main(String[] args)
    {
        Com comDNS= Com.getInstanceof();
        Mx mxDNS= Mx.getInstanceof();
        Net netDNS= Net.getInstanceof();
        Gov govDNS= Gov.getInstanceof();
        DNS dns= new DNS(comDNS,netDNS,mxDNS,govDNS);

        try
        {
            System.out.println(dns.busquedaLinkEnDns(dns.getEnradaUsuario("instagram.com")));;
        }
        catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
        try
        {
            System.out.println(dns.busquedaLinkEnDns(dns.getEnradaUsuario("presidencia.mx")));;
        }
        catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
        try
        {
            System.out.println(dns.busquedaLinkEnDns(dns.getEnradaUsuario("ibero.net")));;
        }
        catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
        try
        {
            System.out.println(dns.busquedaLinkEnDns(dns.getEnradaUsuario("anaya.gov")));;
        }
        catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
        try
        {
            System.out.println(dns.busquedaLinkEnDns(dns.getEnradaUsuario("EPN.gov")));;
        }
        catch(IPNotFoundException e)
        {
            System.out.println(e.toString());
        }
    }
}