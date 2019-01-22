public class TestHoras
{
    public static void main(String[]args)
    {
        Hora hora=new Hora();
        hora.setHoras(12);
        hora.setMinutos(10);
        hora.setSegundos(25);
        hora.setComplete("12:10:25");
        System.out.println("Hours: "+ hora.getHoras());
        System.out.println("Minutes: "+hora.getMinutos());
        System.out.println("Seconds: "+hora.getSegundos());
        System.out.println("Complete Hour: "+hora.getComplete());
    }
}