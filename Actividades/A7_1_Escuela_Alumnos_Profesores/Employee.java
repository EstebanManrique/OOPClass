import java.util.Date;
import java.util.Calendar;

public class Employee extends Person
{
    private Job hisJob;

    public Employee(String name, int JobId, int salary)
    {
        super(name,JobId,salary);
        hisJob=new Job(JobId, salary, new Date()); //COMPOSCIÓN CON JOB
    }
    public void print()
    {
        System.out.println(hisJob);
    }
}