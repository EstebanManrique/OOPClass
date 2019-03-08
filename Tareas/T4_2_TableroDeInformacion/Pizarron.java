import java.sql.Date;
public class Pizarron
{
    protected String nombre;
    private static Pizarron pizarron=null;
    protected Mensaje[] mensajesPosteados;
    protected int numeroPosts;
    public Pizarron(String nombre)
    {
        this.nombre=nombre;
        numeroPosts=0;
        mensajesPosteados=new Mensaje[9999999];
    }
    public static Pizarron getInstance()
    {
        if(pizarron==null)
        {
            pizarron=new Pizarron("miAppRendizaje");
        }
        return pizarron;
    }
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    public String manejoPost(Escuela escuela, Mensaje mensaje)
    {
        if(numeroPosts==0)
        {
            mensajesPosteados[numeroPosts]=mensaje;
            //escuela.post(mensaje);
            numeroPosts++;
            return (mensaje.getDate()+"    "+mensaje.getTexto());
            //System.out.println(mensaje.getTexto());
        }
        else
        {
            int contadorAyuda=0;
            while(contadorAyuda<numeroPosts)
            {
                mensajesPosteados[numeroPosts]=mensajesPosteados[contadorAyuda];
                contadorAyuda++;
            }
            mensajesPosteados[contadorAyuda]=mensaje;
            //escuela.post(mensaje);
            numeroPosts++;
            return (mensaje.getDate()+"    "+mensaje.getTexto());
            //System.out.println(mensaje.getTexto());
        }
    }
    public void impresionHistorial(Date fechaInicial, Date fechaFinal)
    {
        {
            Mensaje[] mensajesPosteadosB;
            int contadorAyuda=0;
            int contadorAyuda2=0;
            while(contadorAyuda<numeroPosts)
            {
                if(mensajesPosteados[contadorAyuda].getDate().compareTo(fechaInicial)>=0&&mensajesPosteados[contadorAyuda].getDate().compareTo(fechaFinal)<=0)
                {
                    
                    //System.out.println(mensajesPosteados[contadorAyuda].getDate()+"  "+mensajesPosteados[contadorAyuda].getTexto()); 
                    contadorAyuda2++;
                    contadorAyuda++; 
                }
                else
                {
                    contadorAyuda++;
                }
            }
            //System.out.println(contadorAyuda2);
            mensajesPosteadosB=new Mensaje[contadorAyuda2];
            contadorAyuda=0;
            contadorAyuda2=0;
            while(contadorAyuda<numeroPosts)
            {
                if(mensajesPosteados[contadorAyuda].getDate().compareTo(fechaInicial)>=0&&mensajesPosteados[contadorAyuda].getDate().compareTo(fechaFinal)<=0)
                {
                    mensajesPosteadosB[contadorAyuda2]=mensajesPosteados[contadorAyuda];
                    contadorAyuda2++;
                    contadorAyuda++;
                }
                else
                {
                    contadorAyuda++;
                }
            }
            Mensaje m;
            for (int cont1 = 1; cont1 < mensajesPosteadosB.length; cont1++) 
            {
                for (int cont2 = cont1; cont2 > 0; cont2--) 
                {
                    if (mensajesPosteadosB[cont2].getDate().compareTo(mensajesPosteadosB[cont2 - 1].getDate())<0) 
                    {
                        m = mensajesPosteadosB[cont2];
                        mensajesPosteadosB[cont2] = mensajesPosteadosB[cont2 - 1];
                        mensajesPosteadosB[cont2 - 1] = m;
                    }
                }
            }
            for (int cont1 = 0; cont1 < mensajesPosteadosB.length; cont1++) 
            {
                System.out.println(mensajesPosteadosB[cont1].getDate()+"  "+mensajesPosteadosB[cont1].getTexto());
            }
        } 
    }
    public void searchFilterPrint(Date fechaInicial, Date fechaFinal)
    {
        Mensaje[] mensajesPosteadosB;
        int contadorAyuda=0;
        int contadorAyuda2=0;
        while(contadorAyuda<numeroPosts)
        {
            if(mensajesPosteados[contadorAyuda].getDate().compareTo(fechaInicial)>=0&&mensajesPosteados[contadorAyuda].getDate().compareTo(fechaFinal)<=0)
            {
                
                //System.out.println(mensajesPosteados[contadorAyuda].getDate()+"  "+mensajesPosteados[contadorAyuda].getTexto()); 
                contadorAyuda2++;
                contadorAyuda++; 
            }
            else
            {
                contadorAyuda++;
            }
        }
        //System.out.println(contadorAyuda2);
        mensajesPosteadosB=new Mensaje[contadorAyuda2];
        contadorAyuda=0;
        contadorAyuda2=0;
        while(contadorAyuda<numeroPosts)
        {
            if(mensajesPosteados[contadorAyuda].getDate().compareTo(fechaInicial)>=0&&mensajesPosteados[contadorAyuda].getDate().compareTo(fechaFinal)<=0)
            {
                mensajesPosteadosB[contadorAyuda2]=mensajesPosteados[contadorAyuda];
                contadorAyuda2++;
                contadorAyuda++;
            }
            else
            {
                contadorAyuda++;
            }
        }
        Mensaje m;
        for (int cont1 = 1; cont1 < mensajesPosteadosB.length; cont1++) 
        {
            for (int cont2 = cont1; cont2 > 0; cont2--) 
            {
                if (mensajesPosteadosB[cont2].getDate().compareTo(mensajesPosteadosB[cont2 - 1].getDate())<0) 
                {
                    m = mensajesPosteadosB[cont2];
                    mensajesPosteadosB[cont2] = mensajesPosteadosB[cont2 - 1];
                    mensajesPosteadosB[cont2 - 1] = m;
                }
            }
        }
        for (int cont1 = 0; cont1 < mensajesPosteadosB.length; cont1++) 
        {
            System.out.println(mensajesPosteadosB[cont1].getDate()+"  "+mensajesPosteadosB[cont1].getTexto());
        }
    }
}