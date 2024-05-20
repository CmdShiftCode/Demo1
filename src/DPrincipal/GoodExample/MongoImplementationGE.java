package DPrincipal.GoodExample;

public class MongoImplementationGE implements DatabaseClient {

    @Override
    public void connect() {
        System.out.println("Mongo DB connected");
    }

    @Override
    public void executeQueryFindById(long id) {
        System.out.println("got data from Mongo DB");
    }

    @Override
    public void disconnect() {
        System.out.println("Mongo DB disconnected");
    }

}
