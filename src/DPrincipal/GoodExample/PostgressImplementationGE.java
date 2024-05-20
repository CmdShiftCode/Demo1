package DPrincipal.GoodExample;

public class PostgressImplementationGE implements DatabaseClient {

    @Override
    public void connect() {
        System.out.println("postress DB connected");
        
    }

    @Override
    public void executeQueryFindById(long id) {
        System.out.println("got data from postress DB ");
    }

    @Override
    public void disconnect() {
        System.out.println("postress DB disconnected");
    }

}
