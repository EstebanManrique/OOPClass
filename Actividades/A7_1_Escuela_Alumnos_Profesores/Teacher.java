public class Teacher extends Employee
{
    private int professionalLicense;
    
    public Teacher(String name, int JobId, int salary)
    {
        super(name,JobId,salary);
    }
    public void teaches()
    {
        System.out.println(getName()+" is teaching");
    }
    public void print()
    {
        System.out.println(name);
        System.out.println(JobId);
        System.out.println(salary);
    }
}