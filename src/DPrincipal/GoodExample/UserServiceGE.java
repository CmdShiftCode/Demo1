package DPrincipal.GoodExample;

public class UserServiceGE {

    public void getDataFromDatabase(DatabaseClient databaseClient, long id)
    {
        databaseClient.connect();
        databaseClient.executeQueryFindById(id);
        databaseClient.disconnect();
    }
}
