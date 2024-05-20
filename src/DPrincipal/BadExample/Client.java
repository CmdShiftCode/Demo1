package DPrincipal.BadExample;

public class Client {

    public static void main(String[] args) {
        UserService userService = new UserService();

        //first i will provide mongo db database
        userService.getDataFromDatabase("mongoDB", 5);

        //now i will provide postgress DB database
        userService.getDataFromDatabase("postgressDB", 5);
    }
}
