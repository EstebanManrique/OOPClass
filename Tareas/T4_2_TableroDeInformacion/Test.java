import java.sql.Date;
public class Test
{
    public static void main(String[] args)
    {

    Pizarron miAppRendizaje=new Pizarron("MiAppRendizaje");

    Escuela itesm= new Escuela("Tec","Licenciatura/Maestria");

    Alumno alumno1= new Alumno("Jorge Sanchez","A01027088",itesm);
    Alumno alumno2= new Alumno("Ignacio Pere001z","A01029732",itesm);
    Alumno alumno3= new Alumno("Ivana Gonzalez","A01014781",itesm);
    Alumno alumno4= new Alumno("Carla Rodriguez","A01087531",itesm);
    Alumno alumno5= new Alumno("Maria Tavira","A01054897",itesm);

    Mensaje mensaje1= new Mensaje("Hoy ceremonia de graduacion",new Date(119,3,18));
    Mensaje mensaje2= new Mensaje("Cancelada la ceremonia", new Date(119,4,19));
    Mensaje mensaje3= new Mensaje("Se esta pensando en cancelar la ceremonia", new Date(119,3,21));

    itesm.post(mensaje1);
    miAppRendizaje.manejoPost(itesm,mensaje1);
	alumno1.getMessage(miAppRendizaje,mensaje1);
    alumno2.getMessage(miAppRendizaje,mensaje1);
    alumno3.getMessage(miAppRendizaje,mensaje1);
    alumno4.getMessage(miAppRendizaje,mensaje1);
    alumno5.getMessage(miAppRendizaje,mensaje1);

    itesm.post(mensaje2);
    miAppRendizaje.manejoPost(itesm,mensaje2);
    alumno1.getMessage(miAppRendizaje,mensaje2);
	alumno2.getMessage(miAppRendizaje,mensaje2);
	alumno3.getMessage(miAppRendizaje,mensaje2);
	alumno4.getMessage(miAppRendizaje,mensaje2);
    alumno5.getMessage(miAppRendizaje,mensaje2);

    itesm.post(mensaje3);
    miAppRendizaje.manejoPost(itesm,mensaje3);
    alumno1.getMessage(miAppRendizaje,mensaje2);
	alumno2.getMessage(miAppRendizaje,mensaje3);
	alumno3.getMessage(miAppRendizaje,mensaje3);
	alumno4.getMessage(miAppRendizaje,mensaje3);
    alumno5.getMessage(miAppRendizaje,mensaje3);

    alumno5.imrprimirHistorialCompleto(miAppRendizaje);
    itesm.imrprimirHistorialCompleto(miAppRendizaje);

    miAppRendizaje.searchFilterPrint(new Date(119,3,18),new Date(119,4,19));

    }
}