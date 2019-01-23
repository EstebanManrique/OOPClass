public class Fecha
{
    //attributes
    private int day;
    private int month;
    private int year;
    //private String complete;

    //methods
    public int getDay()
    {
        return day;
    }
    public void setDay(int day)
    {
        this.day=day;
    }
    public int getMonth()
    {
        return month;   
    }
    public void setMonth(int month)
    {
        this.month=month;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year=year;
    }
   
    public void setComplete(String complete)
    {
        if(complete.length()!=10)
        {
            System.out.println("formato incorrecto");
            return;
        }
        String[]stringDate=complete.split("/");
        day=Integer.parseInt(stringDate[0]);
        month=Integer.parseInt(stringDate[1]);
        year=Integer.parseInt(stringDate[2]);
        
    }
    public String getComplete()
    {
        String tempDate=new String("");
        tempDate=tempDate+day+"/"+month+"/"+year; 
        return tempDate;
    }
}