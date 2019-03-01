public class TestCancionesNominadas
{
    public static void main(String[] args)
    {
        CancionesNominadas lista2018=new CancionesNominadas();

        lista2018.addCancion("Shallow","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow2","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow3","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow4","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow5","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow6","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow7","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow8","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("Shallow9","Lady Gaga","A Star is Born","Melancolica");
        lista2018.addCancion("ShallowA","Lady Gaga","A Star is Born","Melancolica");

        lista2018.restablecerPosicionActual();
        lista2018.print();
        //System.out.println(lista2018.hasNext());

        System.out.println("");

        CancionesNominadas lista2017=new CancionesNominadas();
        
        lista2017.addCancion("Coco y la abuela","Pepe","Coco","Alegre");
        lista2017.addCancion("Coco y la abuela2","Pepe","Coco","Alegre");
        lista2017.addCancion("Coco y la abuela3","Pepe","Coco","Alegre");
        lista2017.addCancion("Coco y la abuela4","Pepe","Coco","Alegre");
        lista2017.addCancion("Coco y la abuela5","Pepe","Coco","Alegre");

        lista2017.remove();
        lista2017.restablecerPosicionActual();
        lista2017.print();

        System.out.println("");

        CancionesNominadas lista2016= new CancionesNominadas();

        lista2016.addCancion("La la Fiasco","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco2","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco3","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco4","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco5","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco6","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco7","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco8","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco9","Emma Stone","La la Land","Movida");
        lista2016.addCancion("La la Fiasco10","Emma Stone","La la Land","Movida");

        lista2016.remove();
        lista2016.restablecerPosicionActual();
        lista2016.print();
    }
}