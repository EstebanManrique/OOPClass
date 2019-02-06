public class Student extends Person
{
    private int studentId;

    public Student(String name,int studentId)
    {
        super(name);
        this.studentId=studentId;
    }
    public void print()
    {
        System.out.println("estudiante: "+getName()+" ID: "+studentId);
    }
}