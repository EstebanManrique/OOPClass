public abstract class SocialNetwork
{
    public abstract boolean sendData(byte[] mensajeEnBytes);
    public abstract char[] traduccionMensaje(byte[] mensajeEnBytes);
    public abstract void simulateNetworkLatency();
    public abstract void postMessage(char[] mensajeCharPorChar);
}