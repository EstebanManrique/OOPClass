public class Test
{
    public static void main(String[] args) 
    {
        Button b= new Button();
        b.setLocation(new Point(200,200));
        b.setBackgroundColor(new Color(30,30,30));
        b.click(100,100);
        b.drawComponent();    
    }
}