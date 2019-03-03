public interface Session
{
    boolean login(Usuario usuario);
    boolean loginString(String usuario, String password);
    boolean logout();
}