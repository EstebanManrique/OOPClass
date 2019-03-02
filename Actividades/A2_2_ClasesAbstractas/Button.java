public class Button extends GraphicComponent implements Clickable
{
    public void click(int x, int y)
    {
        System.out.println("dnado click en "+x+" "+y);
    }
    public void setLocation(Point p)
    {
        position=p;
    }
    public void setBackgroundColor(Color c)
    {
        background=c;
    }
    public void drawComponent()
    {
        System.out.println("estoy dibujando un boton en la posicion "+position.x+" "+position.y);
    }
}