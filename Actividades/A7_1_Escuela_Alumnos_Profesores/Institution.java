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
    public String getInstName()
    {
        return name;
    }
    public void print()
    {
        System.out.println(name);
        for(int counter=0;counter<contStudents;counter++)
        {
            System.out.println(studentsList[counter]);
        }
        for(int counter=0;counter<contTeachers;counter++)
        {
            System.out.println(teachersList[counter]);
        }
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
        int numberFullTime=0;
        for(int counter=0;counter<contTeachers;counter++)
        {
            if(contTeachers%2==4) //CONDICION IMAGINARIA YA QUE NUNCA SE ESTABLECIÓ
            {
                numberFullTime++;
                counter++;
            }
            else
                counter++;
        }
        return numberFullTime;
    }
    public void enrollStudent(Student theStudent) //AGREGACIÓN CON STUDENT
    {
        if(contStudents<100)
            studentsList[contStudents++]=theStudent;
        else
            System.out.println("ya no hay espacios");
    }
    public int getNumberOfPartialTimeTeachers()
    {
        int numberPartialTime=0;
        for(int counter=0;counter<contTeachers;counter++)
        {
            if(contTeachers%2==3) //CONDICION IMAGINARIA YA QUE NUNCA SE ESTABLECIÓ
            {
                numberPartialTime++;
                counter++;
            }
            else
                counter++;
        }
        return numberPartialTime;
    }
}