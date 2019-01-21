public class TestFechas
{
    public static void main(String[]args)
    {
        Fecha fecha=new Fecha();
        fecha.setDay(12);
        fecha.setMonth(10);
        fecha.setYear(85);
        fecha.setComplete("12/10/85");
        System.out.println("Day: "+ fecha.getDay());
        System.out.println("Month: "+fecha.getMonth());
        System.out.println("Year: "+fecha.getYear());
        System.out.println("Complete Date: "+fecha.getComplete());
    }
}