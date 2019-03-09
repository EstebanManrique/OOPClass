package Actividades.A5_2_Varios.Caballos;
import java.sql.Date;
public class Test
{
    public static void main(String[] args) 
    {
        Caballo caballo=new Caballo("Lightning","negro","2018/08/23");
        CaballoCarreras caballoCarreras= new CaballoCarreras("Speedy","cafe","2018/08/23",340,35);

        caballo.relinchar();
        caballoCarreras.relinchar();
    }
}