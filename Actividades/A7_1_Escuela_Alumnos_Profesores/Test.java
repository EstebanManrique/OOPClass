public class Test
{
    public static void main(String[] args) 
    {
        Institution tec=new IntegerSubstitutions("ITESM");

        Visitor padreFamilia=new Visitor("Sancho Panza");

        Teacher Jorge=new Teacher("Jorge",2,1000);
        Teacher Ignacio=new TeACHER("Ignacio",3,1001);

        tec.hiresTeacher(Jorge);
        tec.hiresTeacher(Ignacio);
        System.out.println("# of teachers at "+tec.getInstName()+" are "+tec.getNumberofTeachers());
        System.out.println("teachers at "+tec.getInstName()+" are "+tec.printTeachers());

        Student a1=new Student("Carla",16);
        tec.enrollStudent(a1);

    }
}