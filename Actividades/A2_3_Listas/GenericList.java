public class GenericList<T> implements ListInterface<T>
{
    protected Object[]array;
    protected int contElements=0;
    public GenericList()
    {
        array=new Object[10];
        
    }
    public void add(Object element)
    {
        if(contElements>=10)
            return;
        else
            array[contElements++]=element;
    }
    public void remove(int index)
    {
        for(int i=index;i<contElements-1;i++)
        {
            array[index]=array[index+1];
        }
        array[contElements]=null;
        contElements--;
        
    }
    public int find(Object element)
    {
        int cont=0;
        for(Object ele:array) //FOR EXTENDIDO; SOLO LECTURA, NO SE PUEDENC CAMBIAR VALORES
        {
            if(ele.equals(element))
            {
                return cont;
            }
            cont++;
        }
        return -1;
    }
    public Object get(int index)
    {
        if(index>contElements-1||index<0)
        {
            System.out.println("no existe tal posicion");
            return null;
        }
        else
            return array[index];
    }
    public void print()
    {
        for(int i=0;i<contElements;i++)
        {
            System.out.println(array[i]);
        }
    }
}