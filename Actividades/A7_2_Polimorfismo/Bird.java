public class Bird extends Animal
{
    public void eat()
    {
        System.out.println("bird is eating");
    }
    public void run()
    {
        System.out.println("Corriendo");
    }
    public void sleep()
    {
        System.out.println("Durmiendo");   
    }
    public void sing(String song)
    {
        System.out.println("Canta "+song);
    }
}