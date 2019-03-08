public class Singleton
{
    public int value;
    private static Singleton instance= null;
    private Singleton()
    {

    }
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
}