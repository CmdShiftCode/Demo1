package DPrincipal.GoodExample;

public interface DatabaseClient {

    public void connect();

    public void executeQueryFindById(long id);

    public void disconnect();
}
