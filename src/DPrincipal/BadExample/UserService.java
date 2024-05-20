package DPrincipal.BadExample;

public class UserService {

    private static final String MONGODB = "mongoDB";
    private static final String POSTGRESSDB = "postgressDB";

    public void getDataFromDatabase(String databaseName, long id)
    {

        //first check which Database 
        if(databaseName.equals(MONGODB))
        {
            MongoDBClient mongoDBClient = new MongoDBClient();
            mongoDBClient.connect();
            mongoDBClient.executeQueryFindById(id);
            mongoDBClient.disconnect();
        }
        else if(databaseName.equals(POSTGRESSDB))
        {
            PostgressDBClient postgressDBClient = new PostgressDBClient();
            postgressDBClient.connect();
            postgressDBClient.executeQueryFindById(id);
            postgressDBClient.disconnect();
        }
    }
}
