import java.util.Date;

public class Employee extends Person
{
    private Job hisJob;

    public Employee()
    {
        hisJob=new Job(1,1000,new Date()); //COMPOSCIÓN CON JOB
    }
    public void print()
    {

    }
}