import java.util.Date;
public class Job 
{
    private int jobId;
    private int salary;
    //AQUÍ HAY AGREGACIÓN PORQUE CON DATE PORQUE SE GUARDA DATE
    Date startDate;
    Date endDate;

    private Job()
    {
        //DEFAULT
    }
    public Job(int jobId, int salary, Date startDate)
    {
        this.jobId=jobId;
        this.salary=salary;
        this.startDate=startDate;
    }
    public void doTheJob()
    {
        System.out.println("doing the job");
    }
    public void print()
    {
        System.out.println("the job id is: "+jobId);
        System.out.println("the salary is: "+salary);
        System.out.println("the startDate is: "+startDate);
    }
}