import java.util.Random;

public class Latency
{
    public static void simulateLatency(int initialValue, int finalValue)
    {
        Random r= new Random();
        int tiempo= r.nextInt(finalValue-initialValue)+initialValue;
        long start =System.currentTimeMillis();
        while(true)
        {
            System.out.print(".");
            long current=System.currentTimeMillis();
            if(current-start>=tiempo*1000)
                break;
        }
    }
    public static void main(String[] args) 
    {
        Latency.simulateLatency(2,15);    
    }
}