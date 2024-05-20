package DPrincipal.GoodExample;

public class ClientGE {

    public static void main(String[] args) {
        UserServiceGE userServiceGE = new UserServiceGE();

        //Client will let us know which DB to connect and get data
        MongoImplementationGE mongoImplementationGE = new MongoImplementationGE();
        PostgressImplementationGE postgressImplementationGE = new PostgressImplementationGE();

        userServiceGE.getDataFromDatabase(mongoImplementationGE, 5);
        userServiceGE.getDataFromDatabase(postgressImplementationGE, 5);
        
    }
}
