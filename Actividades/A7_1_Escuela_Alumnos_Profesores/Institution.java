public class Institutiton
{
    private String name;
    private Student[]studentsList;
    private Teacher[]teachersList;

    private int contTeachers;
    private int contStudents;

    public Institution()
    {
        this.name="School with nobody";
        contTeachers=0;
        contStudents=0;
        studentsList=new Student[100];
        teachersList=new Teacher[100];
    }
    public Instituion(String name)
    {
        this.name=name;
        contTeachers=0;
        contStudents=0;
        studentsList=new Student[100];
        teachersList=new Teacher[100];
    }
    public void receivesVisitor(Visitor visitor)
    {
        visitor.visits(); //ASOCIACIÓN CON VISITOR
    }
    public void print()
    {
        // detalles de la institución
    }
    public void hiresTeacher(Teacher teacher) //AGREGACIÓN CON TEACHER
    {
        if(contTeachers<100)
            teachersList[contTeachers++]=theTeacher;
        else
            System.out.println("ya no hay espacios");
    }
    public int getNumberOfTeachers()
    {
        return contTeachers-1;
    }
    public int getNumberOfFullTimeTeachers()
    {
        //PENDIENTES
    }
    public void enrollStudent(Student theStudent)
    {
        if(contStudents<100)
            studentsList[contStudents++]=theStudent;
        else
            System.out.println("ya no hay espacios");
    }
    public int getNumberOfPartialTimeTeachers()
    {
        //PENDIENTES
    }
}