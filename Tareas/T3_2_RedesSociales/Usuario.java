public class Usuario
{
    protected String userName;
    protected String password;

    public Usuario()
    {
        userName="Predeterminado";
        password="123456789";
    }
    public Usuario(String userName, String password)
    {
        this.userName=userName;
        this.password=password;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName=userName;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String separarUserName()
    {
        return getUserName();
    }
    public String seprarPassword()
    {
        return getPassword();
    }
    public byte[] escribirMensaje(String mensaje)
    {
        int contador=0;
        int longitudMensaje=mensaje.length();
        byte[] mensajeUsuario;
        mensajeUsuario=new byte[longitudMensaje];
        while(contador<longitudMensaje)
        {
            mensajeUsuario[contador]=(byte)mensaje.charAt(contador);
            //System.out.println(mensajeUsuario[contador]);
            contador++;
        }
        return mensajeUsuario;
    }
}