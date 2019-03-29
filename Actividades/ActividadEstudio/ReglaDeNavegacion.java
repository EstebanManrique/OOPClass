public class ReglaDeNavegacion<Command,SourceIP,Action>
{
    protected Command comando;
    protected SourceIP sourceIp;
    protected Action action;

    public ReglaDeNavegacion(Command comando, SourceIP sourceIp, Action action)
    {
        this.comando=comando;
        this.sourceIp=sourceIp;
        this.action=action;
    }
    public Command getCommand()
    {
        comando=comando;
        return comando;
    }
    public SourceIP getSourceIp()
    {
        sourceIp=sourceIp;
        return sourceIp;
    }
    public Action getAction()
    {
        action=action;
        return action;
    }
}