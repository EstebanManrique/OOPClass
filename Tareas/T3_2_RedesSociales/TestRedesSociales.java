public class TestRedesSociales
{
    public static void main(String[] args)
    {
        Facebook facebook=new Facebook();
        Usuario usuario1Facebook=new Usuario("Enrique","4576Uhj!");
        Usuario usuario2Facebook=new Usuario("Ana","1234yht");

        facebook.addUser(usuario1Facebook);
        facebook.addUser(usuario2Facebook);
        facebook.login(usuario2Facebook);
        //System.out.println(facebook.loginString("Ana","1234yht"));

        usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo");
        facebook.sendData(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.simulateNetworkLatency();
        facebook.traduccionMensaje(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.postMessage(facebook.traduccionMensaje(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        facebook.logout();

        facebook.loginString("Enrique","4576Uhj!");
       
        usuario1Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo");
        facebook.sendData(usuario1Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.simulateNetworkLatency();
        facebook.traduccionMensaje(usuario1Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.postMessage(facebook.traduccionMensaje(usuario1Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        facebook.logout();

        usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo");
        facebook.sendData(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.simulateNetworkLatency();
        facebook.traduccionMensaje(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        facebook.postMessage(facebook.traduccionMensaje(usuario2Facebook.escribirMensaje("Espero que ya sirva este mendigo metodo")));


        Twitter twitter=new Twitter();
        Usuario usuario1Twitter=new Usuario("Alejandro","45Tghy&%1");
        Usuario usuario2Twitter=new Usuario("Emilio","hfj67tR#");

        twitter.addUser(usuario1Twitter);
        twitter.addUser(usuario2Twitter);
        twitter.login(usuario2Twitter);
        //System.out.println(twitter.loginString("Emilio","hfj67tR#"));

        usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo");
        twitter.sendData(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.simulateNetworkLatency();
        twitter.traduccionMensaje(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.postMessage(twitter.traduccionMensaje(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        twitter.logout();

        twitter.loginString("Alejandro","45Tghy&%1");
       
        usuario1Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo");
        twitter.sendData(usuario1Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.simulateNetworkLatency();
        twitter.traduccionMensaje(usuario1Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.postMessage(twitter.traduccionMensaje(usuario1Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        usuario1Twitter.escribirMensaje("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam imperdiet quam ac ante aliquam, sit amet congue tortor placerat. Quisque ut posuere.");
        twitter.sendData(usuario1Twitter.escribirMensaje("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam imperdiet quam ac ante aliquam, sit amet congue tortor placerat. Quisque ut posuere."));
        twitter.simulateNetworkLatency();
        twitter.traduccionMensaje(usuario1Twitter.escribirMensaje("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam imperdiet quam ac ante aliquam, sit amet congue tortor placerat. Quisque ut posuere."));
        twitter.postMessage(twitter.traduccionMensaje(usuario1Twitter.escribirMensaje("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam imperdiet quam ac ante aliquam, sit amet congue tortor placerat. Quisque ut posuere.")));

        twitter.logout();

        usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo");
        twitter.sendData(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.simulateNetworkLatency();
        twitter.traduccionMensaje(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        twitter.postMessage(twitter.traduccionMensaje(usuario2Twitter.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        Instagram instagram=new Instagram();
        Usuario usuario1Instagram=new Usuario("Maria","guen34QD%%");
        Usuario usuario2Instagram=new Usuario("Flavio","7972EWrq1#");

        instagram.addUser(usuario1Instagram);
        instagram.addUser(usuario2Instagram);
        instagram.login(usuario2Instagram);
        //System.out.println(instagram.loginString("Flavio","7972EWrq1#"));

        usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo");
        instagram.sendData(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.simulateNetworkLatency();
        instagram.traduccionMensaje(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.postMessage(instagram.traduccionMensaje(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        instagram.logout();

        instagram.loginString("Flavio","7972EWrq1#");
       
        usuario1Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo");
        instagram.sendData(usuario1Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.simulateNetworkLatency();
        instagram.traduccionMensaje(usuario1Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.postMessage(instagram.traduccionMensaje(usuario1Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        instagram.logout();

        usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo");
        instagram.sendData(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.simulateNetworkLatency();
        instagram.traduccionMensaje(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo"));
        instagram.postMessage(instagram.traduccionMensaje(usuario2Instagram.escribirMensaje("Espero que ya sirva este mendigo metodo")));

        facebook.login(usuario2Instagram);
        facebook.loginString("Flavio","7972EWrq1#");
        twitter.login(usuario1Facebook);
        twitter.loginString("Ana","1234yht");
        instagram.login(usuario2Twitter);
        instagram.loginString("Alejandro","45Tghy&%1");
    }
}