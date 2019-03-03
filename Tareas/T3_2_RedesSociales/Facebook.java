public class Facebook extends SocialNetwork implements Session
{
    protected Usuario[] usuariosFacebook;
    protected int contadorArrayUsuarios;
    protected String[][] usuariosInfoStringFacebook;
    protected int contadorArrayUsuarios2;
    protected int contadorArrayUsuarios3;
    protected boolean poderPostear;

    public Facebook()
    {
        usuariosFacebook=new Usuario[10];
        contadorArrayUsuarios=0;
        usuariosInfoStringFacebook=new String[10][2];
        contadorArrayUsuarios2=0;
        contadorArrayUsuarios3=0;
    }

    public void addUser(Usuario usuario)
    {
        if(contadorArrayUsuarios<9)
        {
            usuariosFacebook[contadorArrayUsuarios]=usuario;
            contadorArrayUsuarios++;
            usuariosInfoStringFacebook[contadorArrayUsuarios2][contadorArrayUsuarios3]=usuario.getUserName();
            contadorArrayUsuarios3++;
            usuariosInfoStringFacebook[contadorArrayUsuarios2][contadorArrayUsuarios3]=usuario.getPassword();
            contadorArrayUsuarios2++;
            contadorArrayUsuarios3=0;
        }
        else
        {
            System.out.println("Ya no es posible añadir otro usuario; se ha llegado al limite en la red social");
            System.out.println("");
        }
    }

    public boolean login(Usuario usuario)
    {
        boolean retorno=false;
        poderPostear=retorno;
        for(int contTemporal=0; contTemporal<9;contTemporal++)
        {
            if(usuariosFacebook[contTemporal]==usuario)
            {
                retorno=true;
                poderPostear=true;
                return poderPostear;
            }
            else
            {
                retorno=false;
                poderPostear=false;
            }
        }
        System.out.println("No fue posible encontrar tus datos registrados en nuestra base de datos");
        System.out.println("");
        return poderPostear;
    }

    public boolean loginString(String usuario, String password)
    {
        boolean retorno=false;
        poderPostear=retorno;
        for(int contTemporal=0; contTemporal<9;contTemporal++)
        {
            if(usuariosInfoStringFacebook[contTemporal][0]==usuario &&(usuariosInfoStringFacebook[contTemporal][1]==password))
            {
                retorno=true;
                poderPostear=true;
                return poderPostear;
            }
            else
            {
                retorno=false;
                poderPostear=false;
            }
        }
        System.out.println("No fue posible encontrar tus datos registrados en nuestra base de datos");
        System.out.println("");
        return poderPostear;
    }

    public boolean logout()
    {
        poderPostear=false;
        return poderPostear;
    }

    public boolean sendData(byte[] mensaje)
    {
        if(mensaje.length==0)
        {
            System.out.println("No hay nada que enviar ya que el mensaje esta vacio");
            return false;
        }
        else
        {
            //System.out.println(mensaje.length);
            return true;
        }
    }

    public char[] traduccionMensaje(byte[] mensaje)
    {
        int contador=0;
        int longitudMensaje=mensaje.length;
        char[] mensajeUsuario;
        mensajeUsuario=new char[longitudMensaje];
        while(contador<longitudMensaje)
        {
            mensajeUsuario[contador]=(char)mensaje[contador];
            
            //System.out.println(mensajeUsuario[contador]);
            contador++;
        }
        return mensajeUsuario;
    }

    public void simulateNetworkLatency()
    {
        int numeroSegundos;
        numeroSegundos=(int)(Math.random()*(15-2)+2);
       //System.out.println(numeroSegundos);
        try
        {
            Thread.sleep(numeroSegundos*1000);
        }
        catch(InterruptedException posibleException)
        {
            Thread.currentThread().interrupt();
        }
    }

    public void postMessage(char[] mensajeCharPorChar)
    {
        if(poderPostear==false)
        {
            System.out.println("No existen las condiciones para postear tu mensaje");
            System.out.println("");
        }
        else
        {
            for(int contador=0;contador<((mensajeCharPorChar.length)/2);contador++)
            {
                System.out.print("*");
            }
            System.out.print("FACEBOOK");
            for(int contador=0;contador<((mensajeCharPorChar.length)/2);contador++)
            {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
            System.out.print("*  ");
            for(int contador=0;contador<mensajeCharPorChar.length;contador++)
            {
                System.out.print(mensajeCharPorChar[contador]);
            }
            System.out.print("   *");
            System.out.println("");
            System.out.println("");
            for(int contador=0;contador<((mensajeCharPorChar.length)+7);contador++)
            {
                System.out.print("*");
            }
            System.out.println(""); 
        } 
        System.out.println("");   
    }
}