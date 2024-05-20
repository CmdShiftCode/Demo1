package DPrincipal.BadExample;

public class MongoDBClient {
    public void connect()
    {
        //does the operation of connection to Database
        System.out.println("Mongo DB connected");
    }

    public void disconnect()
    {
        //does the operation of disconnecting the Database
        System.out.println("Disconnect form the Mongo DB");
    }

    public void executeQueryFindById(long id)
    {
        //does the operaiton of exceuting some query
        System.out.println("query exceuted in Mongo");

    }
}
