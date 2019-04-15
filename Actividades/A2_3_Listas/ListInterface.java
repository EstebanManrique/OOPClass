public interface ListInterface<T>
{
    void add(T element);
    void remove(int index);
    int find(T element); //devuelve indice de lista
    Object get(int index);
    void print();
}