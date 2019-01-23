public class Hora
{
    //attributes
    private int horas;
    private int minutos;
    private int segundos;
    //String complete;

    //methods
    public int getHoras()
    {
        return horas;
    }
    public void setHoras(int horas)
    {
        this.horas=horas;
    }
    public int getMinutos()
    {
        return minutos;   
    }
    public void setMinutos(int minutos)
    {
        this.minutos=minutos;
    }
    public int getSegundos()
    {
        return segundos;
    }
    public void setSegundos(int segundos)
    {
        this.segundos=segundos;
    }
    public void setComplete(String complete)
    {
        if(complete.length()!=8)
        {
            System.out.println("formato incorrecto");
            return;
        }
        String[]stringHour=complete.split(":");
        horas=Integer.parseInt(stringHour[0]);
        minutos=Integer.parseInt(stringHour[1]);
        segundos=Integer.parseInt(stringHour[2]);
    }
    public String getComplete()
    {
        String tempHour=new String("");
        tempHour=tempHour+horas+":"+minutos+":"+segundos; 
        return tempHour;
    }
}