package jsonpractice;

import com.google.gson.Gson;
import jsonpractice.entity.UserList;
import java.io.FileReader;

public class Principal {

    private static Gson gson;
    private static final String JSON_FILE_PATH = "src/main/resources/User.json";

    public static void main(String[] args) {
        Principal app = new Principal();

        UserList userList = app.getUsersFromJson();
        System.out.println("The complete list of users is:");
        userList.getUserList()
                .stream()
                .forEach((user -> System.out.println(user)));

    }

    public Principal() {
        gson = new Gson();
    }

    public UserList getUsersFromJson() {
        UserList userList = new UserList();
        try {
            userList = gson.fromJson(new FileReader(JSON_FILE_PATH), UserList.class);
        } catch(Exception e) {
            e.printStackTrace(System.out);
        }
        return userList;
    }
}
